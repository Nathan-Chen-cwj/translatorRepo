package com.trans.translator.common.utils;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/6/13 13:28
 *
 * 获取随机验证码工具类
 */
public class GetRandomCode {

    /**
     * 生产4位数随机验证码
     * @param amount 需要生成的验证码的位数
     * @return
     */
    public static String getCode(int amount){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < amount; i++) {
            int rand = (int)(Math.random()*10);
            sb.append(rand);
        }
        return sb.toString();
    }
}
