package com.sc.service.impl;

import com.sc.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0", protocol = {"dubbo"})
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
