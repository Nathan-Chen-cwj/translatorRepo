package com.trans.translator.service.impl;

import com.trans.translator.bo.UserAccountBo;
import com.trans.translator.service.UserService;
import com.trans.translator.vo.UserLoginVo;
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
        return null;
    }

    @Override
    public boolean register(UserAccountBo accountBo) {
        return false;
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
