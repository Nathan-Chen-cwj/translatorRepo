package com.trans.translator.service.impl;

import com.alibaba.fastjson.JSON;
import com.trans.translator.common.ProjectConstant;
import com.trans.translator.service.TransService;
import com.trans.translator.service.core.baidu.TransApi;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/3 23:57
 *
 * 能否将各种声母+韵母的组合编制成一个发音对照表，
 * 然后使用查询返回的结果将其拆分和预先编制的对照表进行对照并拼凑，形成一个中文模拟音？
 */
@Service
public class TransServiceImpl implements TransService {
    @Override
    public String translateByBaiDu(String keywords,String from,String to) {
        //创建百度翻译api对象
        TransApi transApi = new TransApi(ProjectConstant.BAIDU_APP_ID, ProjectConstant.BAIDU_SECURITY_KEY);
        //调用获取翻译结果方法，获取翻译结果
        String transResult = transApi.getTransResult(keywords, from, to);
        //将翻译结果转换成map方便数据处理
        Map map = JSON.parseObject(transResult, Map.class);
        System.out.println(map);
        return transResult;
    }

    @Override
    public String translateByTencent(String keywords) {
        return null;
    }

    @Override
    public String translateByGoogle(String keywords) {
        return null;
    }

    @Override
    public String translateByYouDao(String keywords) {
        return null;
    }
}
