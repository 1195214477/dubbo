package com.atguigu.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1、引入starter
 * 2、配置application.properties【应用名、注册中心地址】
 * 3、@Reference来引用远程服务
 * 4、@EnableDubbo
 */

@EnableDubbo
@SpringBootApplication
public class DubboConsumerUserBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerUserBootApplication.class, args);



    }

}
