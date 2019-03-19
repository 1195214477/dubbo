package com.atguigu.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 1、引入starter
 * 2、编写application.properties中的内容
 *      注册中心地址，应用的名字，dubbo通信协议以及端口号
 * 3、@Service暴露服务
 * 4、开启dubbo功能
 */
@EnableDubbo //开启dubbo功能
@SpringBootApplication
public class DubboProviderMovieBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderMovieBootApplication.class, args);
    }

}
