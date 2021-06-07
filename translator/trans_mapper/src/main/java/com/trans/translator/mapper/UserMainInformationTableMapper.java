package com.trans.translator.mapper;

import com.trans.translator.po.UserMainInformationTable;
import com.trans.translator.vo.UserLoginVo;

/**
* 通用 Mapper 代码生成器
*
* @author mapper-generator
*/
public interface UserMainInformationTableMapper extends tk.mybatis.mapper.common.Mapper<UserMainInformationTable> {

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
     * 用户注册方法
     * 注册要求用户名不能为纯数字，
     * 纯数字的在登陆时直接认定为手机号码登陆
     * @return
     */
    public boolean register();
}




