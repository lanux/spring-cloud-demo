package com.sc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RefreshScope
public class HelloController {

    @Value("${sc.test.config:init}")
    private String config;

    @GetMapping("/hello")
    public String helloNacos(String name) {
        return "你好，" + name + "！系统当前时间：" + LocalDateTime.now() + " 系统配置:" + config;
    }
}
