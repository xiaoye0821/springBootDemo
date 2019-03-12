package com.example.demo.controller;

import com.example.demo.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    private RedisService redisService;

    @RequestMapping("/getHello")
    public String getHello(){
        return redisService.get("hello").toString();
    }

    @RequestMapping("/setHello")
    public void setHello(){
        redisService.set("hello","HelloWorld");
    }
}
