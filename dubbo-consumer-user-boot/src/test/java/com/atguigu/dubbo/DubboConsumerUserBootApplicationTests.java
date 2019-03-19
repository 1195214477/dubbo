package com.atguigu.dubbo;

import com.atguigu.dubbo.bean.User;
import com.atguigu.dubbo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DubboConsumerUserBootApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        User user = new User();
        userService.buyMovie(user,"111");
        userService.buyMovie(user,"111");
        userService.buyMovie(user,"111");
        userService.buyMovie(user,"111");
    }

}
