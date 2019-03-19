package com.atguigu.dubbo;

import com.atguigu.dubbo.bean.User;
import com.atguigu.dubbo.service.MovieService;
import com.atguigu.dubbo.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerMain {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");

        //从ioc中获取组件
        UserService userService = ioc.getBean(UserService.class);

        User user = new User();
        user.setName("张三");
//
        userService.buyMovie(user,"惊奇队长");

        MovieService movieService = ioc.getBean(MovieService.class);
        movieService.getByName("ddd");

        System.out.println("买完了...."+movieService);
    }
}
