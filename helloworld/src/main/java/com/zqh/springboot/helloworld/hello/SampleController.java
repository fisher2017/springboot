package com.zqh.springboot.helloworld.hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class SampleController {


    String home() {
        return "hello world";
    }

//    public static void main(String[] args) {
//        SpringApplication.run(SampleController.class, args);
//    }
}
