package com.trans.translator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Version 1.0
 * @Author NathanChen
 * @Date 2021/3/12 17:24
 */
@MapperScan(basePackages = "com.translator.**.mapper")
@SpringBootApplication
@EnableScheduling
@EnableAsync
public class TranslatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(TranslatorApplication.class,args);
    }
}
