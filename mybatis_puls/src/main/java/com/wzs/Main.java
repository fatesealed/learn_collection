package com.wzs;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wzs.mapper")
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}