package com.trans.translator.common;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/3 23:33
 *
 * 工程常量
 */
public class ProjectConstant {
    /**
     * 百度翻译appId
     */
    public final static String BAIDU_APP_ID = "20201014000589322";
    /**
     * 百度翻译密钥
     */
    public final static String BAIDU_SECURITY_KEY = "ntW_bY9sKCEtXuKUlzvm";
    /**
     * 验证码长度位数
     */
    public final static Integer VER_CODE_LENGTH = 4;

    /**
     * 腾讯翻译secretId
     */
    public final static String TENCENT_SECRET_ID = "AKIDrXx6zauxjESP6WfX8TXJo31h6F6gz1mG";
    /**
     * 腾讯翻译密钥
     */
    public final static String TENCENT_SECRET_KEY="EBsIRItCF1VieJhoeEXZKo0vay4tSjjS";

    /**
     谷歌翻译请求URL
     https://translate.googleapis.com/translate_a/single?client=gtx&sl={fromCulture}&tl={toCulture}&dt=t&q={text}
     2，sl:指定要翻译的语言，auto为自动识别
     3.tl:目标语言。必须指定
     4.q:为要翻译的文本。注意中文的 UrlEncoded 问题
     */
    public static final String GOOGLE_TRANS_API_HOST = "https://translate.googleapis.com/translate_a/single";

    /**
     *     1.clint,dt两个参数不要修改，不然无法正常工作
     */
    public static final String GOOGLE_CLIENT = "gtx";
    public static final String GOOGLE_DT = "t";
}
