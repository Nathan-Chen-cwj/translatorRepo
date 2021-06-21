package com.trans.translator.service.core.google;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MacroZ
 * @date 2021.06.18
 */
public class GoogleTransApi {
    /*
    谷歌翻译请求URL
    https://translate.googleapis.com/translate_a/single?client=gtx&sl={fromCulture}&tl={toCulture}&dt=t&q={text}
    2，sl:指定要翻译的语言，auto为自动识别
    3.tl:目标语言。必须指定
    4.q:为要翻译的文本。注意中文的 UrlEncoded 问题
     */
    private static final String TRANS_API_HOST = "https://translate.googleapis.com/translate_a/single";

    //1.clint,dt两个参数不要修改，不然无法正常工作
    private static final String client = "gtx";
    private static final String dt = "t";
    private String sl = "auto";


    /**
     * 指定源语言并获取翻译结果
     *
     * @param sl 源语言
     * @param tl 目标语言
     * @param q  翻译文本
     * @return 翻译结果
     */
    public String getTransResult(String q, String sl, String tl) {
        //判断是否有指定源语言
        if (sl == null || "".equals(sl)) {
            //没有指定源语言
            Map<String, String> params = buildParams(q, tl);
            return HttpGet.get(TRANS_API_HOST, params);
        } else {
            //指定源语言
            Map<String, String> params = buildParams(q, sl, tl);
            return HttpGet.get(TRANS_API_HOST, params);
        }

    }

    /**
     * 指定源语言的请求参数构造器
     * @param q 原文
     * @param sl    源语言
     * @param tl    目标语言
     * @return  参数集合
     */
    private Map<String, String> buildParams(String q, String sl, String tl) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("sl", sl);
        params.put("tl", tl);
        params.put("q", q);
        params.put("client", client);
        params.put("dt", dt);
        return params;
    }

    /**
     * 没有指定源语言的参数构造器
     * @param q 原文
     * @param tl    目标语言
     * @return  参数集合
     */
    private Map<String, String> buildParams(String q, String tl) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("sl", this.sl);
        params.put("tl", tl);
        params.put("q", q);
        params.put("client", client);
        params.put("dt", dt);
        return params;
    }
}

