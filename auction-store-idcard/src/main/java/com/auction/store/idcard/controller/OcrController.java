package com.auction.store.idcard.controller;

import com.auction.store.idcard.utils.FileUtils;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.ocr.v20181119.OcrClient;
import com.tencentcloudapi.ocr.v20181119.models.IDCardOCRRequest;
import com.tencentcloudapi.ocr.v20181119.models.IDCardOCRResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import pojo.Response;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;


@RestController
@Api(tags = "身份认证")
@RequestMapping("/v1/card")
public class OcrController {

    @ApiOperation("身份证识别")
    @PostMapping(value = "/upload" ,produces = "application/json; charset=utf-8")
    public Response IDCardOCR ( @RequestParam() MultipartFile file, HttpServletRequest request) {
        File path = null;
        try {
            path = new File(ResourceUtils.getURL("classpath:").getPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File upload = new File(path.getAbsolutePath(),"static/upload/");
        if(!upload.exists()) upload.mkdirs();
        if (FileUtils.upload(file, upload.getAbsolutePath(), file.getOriginalFilename())){
            try{
                Credential cred = new Credential("AKIDqVv4SbNCblLYUCOqnTs1ub6KI0XosPow", "3tSklX5OQeS4QaU9XqsBR6VeYAj49zYq");

                HttpProfile httpProfile = new HttpProfile();
                httpProfile.setEndpoint("ocr.tencentcloudapi.com");

                ClientProfile clientProfile = new ClientProfile();
                clientProfile.setHttpProfile(httpProfile);
                System.out.println("文件名称"+file.getOriginalFilename());
                OcrClient client = new OcrClient(cred, "ap-beijing", clientProfile);
                String params = "{\"ImageUrl\":\"http://xixi.natapp4.cc/upload/58b2bae0d0f52853332636cba17e750c.jpg\",\"CardSide\":\"FRONT\"}";
                IDCardOCRRequest req = IDCardOCRRequest.fromJsonString(params, IDCardOCRRequest.class);

                IDCardOCRResponse resp = client.IDCardOCR(req);

                return Response.success(IDCardOCRRequest.toJsonString(resp));
            } catch (TencentCloudSDKException e) {
                e.printStackTrace();
                return Response.failed("图片未识别，请重新上传");
            }
        }else {
            return Response.failed("文件上传失败");
        }

    }
}
