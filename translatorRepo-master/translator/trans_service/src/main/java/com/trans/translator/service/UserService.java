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
     * 用户注册方法
     * 注册要求用户名不能为纯数字，
     * 纯数字的在登陆时直接认定为手机号码登陆
     * 本质是向用户及用户相关表插入数据
     *
     * 注册用户须有：
     * 1.手机号码正则校验，手机短信校验
     * 2.验证用户名是否已被使用
     * 3.邮箱正则校验，邮箱验证码校验
     * @param accountBo 用于验证当前用户的用户信息
     * @return
     */
    public UserLoginVo register(UserAccountBo accountBo);

    /**
     * 用户注销账号
     * 注销用户须有：
     * 1.手机短信校验或邮箱验证码校验
     * @param accountBo 用于验证当前用户的用户信息
     * @return
     */
    public boolean logOffAccount(UserAccountBo accountBo);

    /**
     * 用户更新账号信息
     * 更新除id的所有内容，id唯一且不可变，更改一下所有信息都须携带id
     * 1.更新用户名需要验证新用户名是否已被使用
     * 2.更改手机号码需要发送验证码，检验手机是否是用户自己的手机
     * 3.更改密码需要验证旧密码
     *      或者使用手机号码+验证码验证
     *
     * @param accountBo 用于验证当前用户的用户信息
     * @return
     */
    public UserLoginVo updateAccountMsg(UserAccountBo accountBo);

    /**
     * 用户登陆 用户名+密码、手机号+密码、手机号+验证码、第三方登陆
     * @param accountBo 用于验证当前用户的用户信息
     * @return
     */
    public UserLoginVo doesUsernameMatchPassword(UserAccountBo accountBo);

    /**
     * 用户登陆 手机号+密码
     * @param accountBo 用于验证当前用户的用户信息
     * @return
     */
    public UserLoginVo doesMobileMatchPassword(UserAccountBo accountBo);

    /**
     * 用户登陆 手机号+验证码
     * @param accountBo 用于验证当前用户的用户信息
     * @return
     */
    public UserLoginVo doesVerificationCodeMatch(UserAccountBo accountBo);

    /**
     * 主要用于注册时：
     *      校验用户名是否已被使用
     * @param username
     * @return
     */
    public String doesUsernameHasBeenUsed(String username);

    /**
     * 主要用于注册时：
     *      校验手机号码是否已被使用
     * @param mobile
     * @return
     */
    public String doesMobileHasBeenUsed(String mobile);

    /**
     * 主要用于注册时：
     *      校验邮箱是否已被使用
     * @param email
     * @return
     */
    public String doesEmailHasBeenUsed(String email);

}
