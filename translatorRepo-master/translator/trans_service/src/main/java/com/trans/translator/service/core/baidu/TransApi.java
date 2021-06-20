package com.trans.translator.service.core.baidu;

import com.trans.translator.common.utils.encryptionanddecryption.MD5;
import com.trans.translator.common.utils.encryptionanddecryption.Md5Util;

import java.util.HashMap;
import java.util.Map;

/**
 * 请求百度翻译API
 * @author vessel
 */
public class TransApi {
    private static final String TRANS_API_HOST = "http://api.fanyi.baidu.com/api/trans/vip/translate";

    private String appid;
    private String securityKey;

    public TransApi(String appid, String securityKey) {
        this.appid = appid;
        this.securityKey = securityKey;
    }

    /**
     * 获取翻译结果
     * @param query keyword 需要翻译的词句
     * @param from 源语言
     * @param to 目标语言
     * @return
     */
    public String getTransResult(String query, String from, String to) {
        Map<String, String> params = buildParams(query, from, to);
        return HttpGet.get(TRANS_API_HOST, params);
    }

    private Map<String, String> buildParams(String query, String from, String to) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("q", query);
        params.put("from", from);
        params.put("to", to);

        params.put("appid", appid);

        // 随机数
        String salt = String.valueOf(System.currentTimeMillis());
        params.put("salt", salt);

        // 签名 加密前的原文
        String src = appid + query + salt + securityKey;
        params.put("sign", MD5.md5(src));

        return params;
    }

}
