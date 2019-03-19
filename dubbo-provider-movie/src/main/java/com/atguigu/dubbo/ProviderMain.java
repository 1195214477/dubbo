package com.atguigu.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderMain {

    //1、引入dubbo相关的jar包
    //2、编写相关的配置
    public static void main(String[] args) throws IOException {
        //1、启动dubbo容器
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");



        System.in.read(); // 按任意键退出;
    }
}
