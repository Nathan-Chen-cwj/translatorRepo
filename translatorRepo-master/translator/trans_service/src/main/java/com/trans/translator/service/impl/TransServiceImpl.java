package com.trans.translator.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.trans.translator.common.ProjectConstant;
import com.trans.translator.service.TransService;
import com.trans.translator.service.core.baidu.TransApi;
import com.trans.translator.service.core.google.GoogleTransApi;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.Map;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/3 23:57
 * <p>
 * 能否将各种声母+韵母的组合编制成一个发音对照表，
 * 然后使用查询返回的结果将其拆分和预先编制的对照表进行对照并拼凑，形成一个中文模拟音？
 */
@Service
public class TransServiceImpl implements TransService {
    @Override
    public String translateByBaiDu(String keywords, String from, String to) {
        //创建百度翻译api对象
        TransApi transApi = new TransApi(ProjectConstant.BAIDU_APP_ID, ProjectConstant.BAIDU_SECURITY_KEY);
        //调用获取翻译结果方法，获取翻译结果
        String transResult = transApi.getTransResult(keywords, from, to);
        //将翻译结果转换成map方便数据处理
        Map map = JSON.parseObject(transResult, Map.class);
        /*
            将翻译原文和翻译结果提取分离出来进行进行自己的逻辑处理
            1.确定是否需要把其作为热键存储到redis中
            2.把我们需要添加翻译中文注音匹配词句添加到结构中
                通过to这个变量来确定使用哪个注音表
         */
        System.out.println(map);
        return transResult;
    }

    @Override
    public String translateByTencent(String keywords) {
        return null;
    }

    @Override
    public String translateByGoogle(String keywords, String from, String to) {
        //google翻译api
        GoogleTransApi googleTransApi = new GoogleTransApi();
        //获取翻译结果
        String transResult = googleTransApi.getTransResult(keywords, from, to);

        //直接返回google翻译结果
        //System.out.println(transResult);
        //return transResult;

        //将结果进行处理后只输出译文
        JSONArray jsonObject = JSONArray.parseArray(transResult);
        String retStr = "";
        for (Iterator<Object> it = jsonObject.getJSONArray(0).iterator(); it.hasNext(); ) {
            JSONArray a = (JSONArray) it.next();
            retStr += a.getString(0);
        }
        //返回处理后仅输出译文
        System.out.println(retStr);
        return transResult;
    }

    @Override
    public String translateByYouDao(String keywords) {
        return null;
    }
}
