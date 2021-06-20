package com.trans.translator.service;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/3 18:29
 * 翻译方法接口
 * 调用：
 * 百度翻译处理翻译业务
 * 腾讯翻译处理翻译业务
 * 谷歌翻译处理翻译业务
 * 有道翻译处理翻译业务
 * <p>
 * 调用接口需要什么参数，参数的形式是怎么样的？怎么发送请求？获取怎么样的结果？
 */
public interface TransService {
    /**
     * 百度翻译处理翻译业务
     * * @param query keyword 需要翻译的词句
     *
     * @param from     源语言
     * @param to       目标语言
     * @param keywords
     * @return
     */
    public String translateByBaiDu(String keywords, String from, String to);

    /**
     * 腾讯翻译处理翻译业务
     *
     * @param keywords
     * @return
     */
    public String translateByTencent(String keywords);

    /**
     * 谷歌翻译处理翻译业务
     *
     * @param keywords  原文
     * @param from 源语言
     * @param to 目标语言
     * @return
     */
    public String translateByGoogle(String keywords, String from, String to);

    /**
     * 有道翻译处理翻译业务
     *
     * @param keywords
     * @return
     */
    public String translateByYouDao(String keywords);
}
