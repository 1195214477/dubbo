package com.atguigu.dubbo.service.impl;

import com.atguigu.dubbo.bean.Movie;
import com.atguigu.dubbo.service.MovieService;
import org.springframework.stereotype.Service;


/**
 * 远程能调用
 * 1）、创建一个spring配置文件
 */

public class MovieServiceImpl implements MovieService {
    @Override
    public Movie getByName(String name) {

        Movie movie = new Movie("惊奇队长", 35.8, "3d");
        return movie;
    }
}
