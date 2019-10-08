package com.auction.store.idcard;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;

import com.tencentcloudapi.ocr.v20181119.OcrClient;

import com.tencentcloudapi.ocr.v20181119.models.IDCardOCRRequest;
import com.tencentcloudapi.ocr.v20181119.models.IDCardOCRResponse;

public class IDCardOCR {

    public static void main(String [] args) {
//        try{
//
//            Credential cred = new Credential("AKIDqVv4SbNCblLYUCOqnTs1ub6KI0XosPow", "3tSklX5OQeS4QaU9XqsBR6VeYAj49zYq");
//
//            HttpProfile httpProfile = new HttpProfile();
//            httpProfile.setEndpoint("ocr.tencentcloudapi.com");
//
//            ClientProfile clientProfile = new ClientProfile();
//            clientProfile.setHttpProfile(httpProfile);
//
//            OcrClient client = new OcrClient(cred, "ap-beijing", clientProfile);
//
//            String params = "{\"ImageUrl\":\"http://xixi.natapp4.cc/good/upload/index.jpg\",\"CardSide\":\"FRONT\"}";
//            IDCardOCRRequest req = IDCardOCRRequest.fromJsonString(params, IDCardOCRRequest.class);
//
//            IDCardOCRResponse resp = client.IDCardOCR(req);
//
//            System.out.println(IDCardOCRRequest.toJsonString(resp));
//        } catch (TencentCloudSDKException e) {
//            System.out.println(e.toString());
//        }

    }
}
