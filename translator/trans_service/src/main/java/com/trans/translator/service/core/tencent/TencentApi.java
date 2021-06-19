package com.trans.translator.service.core.tencent;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.tmt.v20180321.TmtClient;
import com.tencentcloudapi.tmt.v20180321.models.TextTranslateRequest;
import com.tencentcloudapi.tmt.v20180321.models.TextTranslateResponse;
import com.trans.translator.common.ProjectConstant;


/**
 * @Author Cx
 * @Date 2021-06-17
 * @Version 1.0
 */
public class TencentApi {

    private static final String TRANS_API_HOST = "tmt.tencentcloudapi.com";

    /**
     * 获取翻译结果
     * @param query keyword 需要翻译的词句
     * @param from 源语言
     * @param to 目标语言
     * @return
     */
    public  static String getTransResult(String query, String from, String to) throws TencentCloudSDKException{
        String result = null;
            Credential cred = new Credential(ProjectConstant.TENCENT_SECRET_ID, ProjectConstant.TENCENT_SECRET_KEY);
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setEndpoint(TRANS_API_HOST);
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);
            TmtClient client = new TmtClient(cred, "ap-guangzhou", clientProfile);
            TextTranslateRequest req = new TextTranslateRequest();
            req.setSourceText(query);
            req.setSource(from);
            req.setTarget(to);
            req.setProjectId(0L);
            TextTranslateResponse resp = client.TextTranslate(req);
            String json_result = TextTranslateResponse.toJsonString(resp);
            JsonObject jsonObj = (JsonObject)new JsonParser().parse(json_result);
            String res = jsonObj.get("TargetText").toString();
            result = res.replaceAll("\"", "");
        return  result;
    }

}
