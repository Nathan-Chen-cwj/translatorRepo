package com.trans.translator.common.utils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ResourceBundle;

/**
 * 短信验证码生成和获取
 * @Version 1.0
 * @Author NathanChen
 * @Date 2020/8/17 16:29
 */
public class SmsSample {
   static ResourceBundle rb = ResourceBundle.getBundle("sms");

    /**
     * 用户注册短信
     * @param testPhone 用户手机号码
     * @return 返回0发送成功，否则失败
     */
    public static String regSendSMS(String testPhone,String code){
        String testContent = "【trans】您正在使用此手机注册trans账号，验证码为"+code+" 10分钟内有效 不是本人操作，请忽略！";
        StringBuffer httpArg = new StringBuffer();
        httpArg.append("u=").append(rb.getString("dxb.username")).append("&");
        httpArg.append("p=").append(md5(rb.getString("dxb.password"))).append("&");
        httpArg.append("m=").append(testPhone).append("&");
        httpArg.append("c=").append(encodeUrlString(testContent, "UTF-8"));
        //如果返回0,则发送成功。
        String result = request(rb.getString("dxb.httpUrl"), httpArg.toString());
        return result;
    }



    public static String request(String httpUrl, String httpArg) {
        BufferedReader reader = null;
        String result = null;
        StringBuffer sbf = new StringBuffer();
        httpUrl = httpUrl + "?" + httpArg;

        try {
            URL url = new URL(httpUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            InputStream is = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            String strRead = reader.readLine();
            if (strRead != null) {
                sbf.append(strRead);
                while ((strRead = reader.readLine()) != null) {
                    sbf.append("\n");
                    sbf.append(strRead);
                }
            }
            reader.close();
            result = sbf.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String md5(String plainText) {
        StringBuffer buf = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();
            int i;
            buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0) {
                    i += 256;
                }
                if (i < 16) {
                    buf.append("0");
                }
                buf.append(Integer.toHexString(i));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return buf.toString();
    }

    public static String encodeUrlString(String str, String charset) {
        String strret = null;
        if (str == null) {
            return str;
        }
        try {
            strret = java.net.URLEncoder.encode(str, charset);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return strret;
    }

}
