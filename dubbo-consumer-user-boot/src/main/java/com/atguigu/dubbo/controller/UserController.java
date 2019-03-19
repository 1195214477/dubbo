package com.atguigu.dubbo.controller;

import com.atguigu.dubbo.bean.User;
import com.atguigu.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String hello(){
        User user = new User();
        userService.buyMovie(user,"111");
        return "ok";
    }
}
