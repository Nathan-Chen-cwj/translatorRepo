package com.trans.translator.service.impl;

import com.trans.translator.bo.UserAccountBo;
import com.trans.translator.common.utils.RedisUtils;
import com.trans.translator.exception.LoginException;
import com.trans.translator.mapper.UserJurisdictionTableMapper;
import com.trans.translator.mapper.UserLabelTableMapper;
import com.trans.translator.mapper.UserMainInformationTableMapper;
import com.trans.translator.service.UserService;
import com.trans.translator.vo.UserLoginVo;
import org.mayanjun.code.idworker.IdWorker;
import org.mayanjun.code.idworker.IdWorkerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

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
    private UserLabelTableMapper userLabelTableMapper;
    @Autowired
    private UserJurisdictionTableMapper userJurisdictionTableMapper;
    @Autowired
    private RedisUtils redisUtils;

    @Transactional(readOnly = true)
    @Override
    public UserLoginVo doesUsernameMatchPassword(UserAccountBo accountBo) {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public UserLoginVo doesMobileMatchPassword(UserAccountBo accountBo) {
        return null;
    }

    @Transactional(readOnly = true)
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

    @Transactional(readOnly = true)
    @Override
    public String doesUsernameHasBeenUsed(String username) {

        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public String doesMobileHasBeenUsed(String mobile) {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public String doesEmailHasBeenUsed(String email) {
        return null;
    }

    /**
     * 笔记：
     *  (String)、toString、String.valueOf的区别
     *  string强转形式，简单方便，效率高 局限性也很大，
     *      这种方法并不能强制转换成其他非String类型，例如：Boolean boolean1 = true;
     *      String str3 = (String)boolean1;//这行代码会报错，编译不过
     *      ，但是（String）null这么写合法
     *  toString返回此对象本身（它已经是一个字符串了）。
     *      按照它的意思就是说一般的对象或者参数都是有toString()的方法的，
     *      只是要注意在一个参数定义为int类型是就没有这个方法了。
     *      还有就是当参数为空的时候.toString()方法就会报出空指针异常
     *  String.valueOf()：这个方法是静态的，直接通过String调用，可以说是完美，只是平时不习惯这样写而已，这样的实现避免了前面两个的不足和缺点。首先来看看他内部的实现机制：
     *      public static String valueOf(Object obj){return (obj==null) ? "null" : obj.toString()};
     *      在内部就是做了为空的判断的，所以就不会报出空指针异常。
     * @param accountBo 用于验证当前用户的用户信息
     * @return
     */
    @Transactional(rollbackFor =Exception.class)
    @Override
    public UserLoginVo register(UserAccountBo accountBo) {
        /*
            生成id
         */
        IdWorker idWorker = IdWorkerFactory.create();
        String userId = String.valueOf(idWorker.nextId());
        accountBo.setUserId(userId);
        accountBo.setCreatedTime(new Date());
        accountBo.setUpdatedTime(new Date());
        userMainInformationTableMapper.insertIntoUserMainInfTab(accountBo);
        userMainInformationTableMapper.insertIntoUserLabTab(accountBo);

        return null;
    }

    @Transactional(rollbackFor =Exception.class)
    @Override
    public boolean logOffAccount(UserAccountBo accountBo) {
        return false;
    }

    @Transactional(rollbackFor =Exception.class)
    @Override
    public UserLoginVo updateAccountMsg(UserAccountBo accountBo) {
        return null;
    }
}
