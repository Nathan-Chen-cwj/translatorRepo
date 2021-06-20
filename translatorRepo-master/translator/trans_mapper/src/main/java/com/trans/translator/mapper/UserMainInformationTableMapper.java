package com.trans.translator.mapper;

import com.trans.translator.bo.UserAccountBo;
import com.trans.translator.po.UserMainInformationTable;
import com.trans.translator.vo.UserLoginVo;

/**
* 通用 Mapper 代码生成器
*
* @author mapper-generator
*/
public interface UserMainInformationTableMapper extends tk.mybatis.mapper.common.Mapper<UserMainInformationTable> {

    /**
     * 用户注册方法
     * 注册要求用户名不能为纯数字，
     * 纯数字的在登陆时直接认定为手机号码登陆
     * @param accountBo
     * @return
     */
    public boolean register(UserAccountBo accountBo);

    /**
     * 用户注销账号
     *
     * @param accountBo 用于验证当前用户的用户信息
     * @return
     */
    public boolean logOffAccount(UserAccountBo accountBo);

    /**
     * 用户登陆 用户名+密码、手机号+密码、手机号+验证码、第三方登陆
     * @return
     */
    public UserLoginVo doesUsernameMatchPassword();

    /**
     * 用户登陆 手机号+密码
     * @return
     */
    public UserLoginVo doesMobileMatchPassword();

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




