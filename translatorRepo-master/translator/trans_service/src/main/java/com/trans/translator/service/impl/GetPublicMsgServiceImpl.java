package com.trans.translator.service.impl;

import com.trans.translator.common.ProjectConstant;
import com.trans.translator.common.utils.GetRandomCode;
import com.trans.translator.common.utils.RedisUtils;
import com.trans.translator.common.utils.SmsSample;
import com.trans.translator.service.GetPublicMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/13 13:47
 */
@Service
public class GetPublicMsgServiceImpl implements GetPublicMsgService {

    @Autowired
    private RedisUtils redisUtils;

    @Override
    public String getMobileVerCode(String mobile) {
        boolean hasKey = redisUtils.exists(mobile+"-ver");
        String verCode = GetRandomCode.getCode(ProjectConstant.VER_CODE_LENGTH);
        if(hasKey){
            //如果存在,则直接从内存当中取出验证码,并且进行短信发送
            SmsSample.regSendSMS(mobile,(String) redisUtils.get(mobile + "-ver"));
        }else {
            /*
            将获取到的验证码存放到redis当中,失效为10min
                TimeUnit是java.util.concurrent包下面的一个类，表示给定单元粒度的时间段
                主要作用：1、时间颗粒度转换 2、延时
                TimeUnit.DAYS          //天
                TimeUnit.HOURS         //小时
                TimeUnit.MINUTES       //分钟
                TimeUnit.SECONDS       //秒
                TimeUnit.MILLISECONDS  //毫秒
                使用TimeUnit做延时5秒：TimeUnit.SECONDS.sleep( 5 )
             */
            redisUtils.set(mobile+"-ver",verCode,10L, TimeUnit.MINUTES);
            //调用发送方法，发送验证码给用户
            SmsSample.regSendSMS(mobile,verCode);
        }
        return (String) redisUtils.get(mobile+"-ver");
    }
}
