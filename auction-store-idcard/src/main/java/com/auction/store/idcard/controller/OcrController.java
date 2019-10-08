package com.auction.store.idcard.controller;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.ocr.v20181119.OcrClient;
import com.tencentcloudapi.ocr.v20181119.models.IDCardOCRRequest;
import com.tencentcloudapi.ocr.v20181119.models.IDCardOCRResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pojo.Response;


@RestController
@Api(tags = "身份认证")
@RequestMapping("/v1/card")
public class OcrController {

    @ApiOperation("身份证识别")
    @GetMapping("/{imageName}")
    public Response IDCardOCR (@PathVariable("imageName") String imageName) {
        try{
            Credential cred = new Credential("AKIDqVv4SbNCblLYUCOqnTs1ub6KI0XosPow", "3tSklX5OQeS4QaU9XqsBR6VeYAj49zYq");

            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint("ocr.tencentcloudapi.com");

            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            OcrClient client = new OcrClient(cred, "ap-beijing", clientProfile);

            String params = "{\"ImageUrl\":\"http://xixi.natapp4.cc/good/upload/"+imageName+"\",\"CardSide\":\"FRONT\"}";
            IDCardOCRRequest req = IDCardOCRRequest.fromJsonString(params, IDCardOCRRequest.class);

            IDCardOCRResponse resp = client.IDCardOCR(req);

            return Response.success(IDCardOCRRequest.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
            return Response.failed(e.getMessage());
        }
    }
}
