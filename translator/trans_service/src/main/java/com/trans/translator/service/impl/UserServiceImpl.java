package com.trans.translator.service.impl;

import com.trans.translator.bo.UserAccountBo;
import com.trans.translator.common.utils.RedisUtils;
import com.trans.translator.exception.LoginException;
import com.trans.translator.mapper.UserMainInformationTableMapper;
import com.trans.translator.service.UserService;
import com.trans.translator.vo.UserLoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/3/12 17:44
 *
 * 用户账户信息表具体操作服务类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMainInformationTableMapper userMainInformationTableMapper;
    @Autowired
    private RedisUtils redisUtils;

    @Override
    public UserLoginVo doesUsernameMatchPassword(UserAccountBo accountBo) {
        return null;
    }

    @Override
    public UserLoginVo doesMobileMatchPassword(UserAccountBo accountBo) {
        return null;
    }

    @Override
    public UserLoginVo doesVerificationCodeMatch(UserAccountBo accountBo) {
        //用户手机号
        String phone = accountBo.getPhone();
        //前端传来的用户输入的手机验证码
        String verCode = accountBo.getVerCode();
        //从redis中获取的系统生成的验证码
        String verCodeInRedis = (String)redisUtils.get(phone + "-ver");
        //如果用户输入的和系统存储的用户验证码一致，用户验证通过
        if (verCode.equals(verCodeInRedis)){
            //查询数据库将用户信息返回

        }else {
            //用户验证失败，抛短信验证码校验失败异常
            throw new LoginException("验证码输入有误！请重新输入！");
        }
        return null;
    }

    @Override
    public String doesUsernameHasBeenUsed(String username) {

        return null;
    }

    @Override
    public String doesMobileHasBeenUsed(String mobile) {
        return null;
    }

    @Override
    public String doesEmailHasBeenUsed(String email) {
        return null;
    }

    @Override
    public UserLoginVo register(UserAccountBo accountBo) {
        return null;
    }

    @Override
    public boolean logOffAccount(UserAccountBo accountBo) {
        return false;
    }

    @Override
    public UserLoginVo updateAccountMsg(UserAccountBo accountBo) {
        return null;
    }
}
