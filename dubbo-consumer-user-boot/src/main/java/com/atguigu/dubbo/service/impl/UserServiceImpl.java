package com.atguigu.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.dubbo.bean.Movie;
import com.atguigu.dubbo.bean.User;
import com.atguigu.dubbo.service.MovieService;
import com.atguigu.dubbo.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {


    @Reference //代表远程引用服务
    MovieService movieService;

    public MovieService getMovieService() {
        return movieService;
    }

    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public void buyMovie(User user, String movieName) {

        //访问电影服务购买电影
        Movie name = movieService.getByName("惊奇队长");
        System.out.println("user:"+user+"购买了："+name);
    }
}
