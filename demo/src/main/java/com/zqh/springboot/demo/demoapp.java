package com.zqh.springboot.demo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
@MapperScan("com.zqh.springboot.demo.mapper")
public class demoapp {
    public static void main(String[] args) {
        SpringApplication.run(demoapp.class, args);
    }
}
