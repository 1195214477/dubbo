package com.atguigu.dubbo.bean;

import java.io.Serializable;

public class Movie implements Serializable {

    private String movieName;
    private Double price;
    private String desc;

    public Movie(String movieName, Double price, String desc) {
        this.movieName = movieName;
        this.price = price;
        this.desc = desc;
    }


    public Movie() {
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }
}
