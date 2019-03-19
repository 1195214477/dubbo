package com.atguigu.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.dubbo.bean.Movie;
import com.atguigu.dubbo.service.MovieService;


/**
 * 远程能调用
 * 1）、引入dubbo-starter
 * 2）、在需要暴露的服务上 标注 dubbo的 @Service
 */
@Service //使用
public class MovieServiceImpl implements MovieService {
    @Override
    public Movie getByName(String name) {

        System.out.println("222222222222222222222222222222222==》20881");
        Movie movie = new Movie("惊奇队长", 35.8, "3d");
        return movie;
    }
}
