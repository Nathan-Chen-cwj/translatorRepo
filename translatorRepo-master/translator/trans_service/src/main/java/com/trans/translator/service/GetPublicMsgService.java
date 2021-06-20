package com.trans.translator.service;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/13 13:44
 *
 * 每个用户都可以获取的信息的服务
 */
public interface GetPublicMsgService {
    /**
     * 获取短信 验证码
     * @param mobile 需要的验证码的手机号
     * @return
     */
    public String getMobileVerCode(String mobile);
}
