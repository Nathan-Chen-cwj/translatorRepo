package com.trans.translator.service.core.google;

import com.trans.translator.common.ProjectConstant;
import com.trans.translator.common.utils.HttpGet;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MacroZ
 * @date 2021.06.18
 */
public class GoogleTransApi {

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
            return HttpGet.get(ProjectConstant.GOOGLE_TRANS_API_HOST, params);
        } else {
            //指定源语言
            Map<String, String> params = buildParams(q, sl, tl);
            return HttpGet.get(ProjectConstant.GOOGLE_TRANS_API_HOST, params);
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
        params.put("client", ProjectConstant.GOOGLE_CLIENT);
        params.put("dt", ProjectConstant.GOOGLE_DT);
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
        params.put("client", ProjectConstant.GOOGLE_CLIENT);
        params.put("dt", ProjectConstant.GOOGLE_DT);
        return params;
    }
}

