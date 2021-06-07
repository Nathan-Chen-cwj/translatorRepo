package com.trans.translator.service;


import com.trans.translator.bo.UserAccountBo;
import com.trans.translator.vo.UserLoginVo;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/1/17 21:17
 *
 * 用户服务接口 用户相关信息的增删改查
 * 包含用户登陆、注册、获取当前用户凭证、获取当前用户全部信息等方法
 */
public interface UserService {

    /**
     * 用户登陆 用户名+密码、手机号+密码、手机号+验证码、第三方登陆
     * @return
     */
    public UserLoginVo doesUsernameMatchPassword(UserAccountBo accountBo);

    /**
     * 用户登陆 手机号+密码
     * @return
     */
    public UserLoginVo doesMobileMatchPassword(UserAccountBo accountBo);

    /**
     * 用户登陆 手机号+验证码
     * @return
     */
    public UserLoginVo doesVerificationCodeMatch(UserAccountBo accountBo);

    /**
     * 用户注册方法
     * 注册要求用户名不能为纯数字，
     * 纯数字的在登陆时直接认定为手机号码登陆
     * 本质是向用户及用户相关表插入数据
     * @return
     */
    public boolean register(UserAccountBo accountBo);

    /**
     * 用户注销账号
     * @return
     */
    public boolean logOffAccount(UserAccountBo accountBo);

    /**
     * 用户更新账号信息
     * @return
     */
    public UserLoginVo updateAccountMsg(UserAccountBo accountBo);

}
