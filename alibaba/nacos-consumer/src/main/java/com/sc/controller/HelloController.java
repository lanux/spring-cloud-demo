package com.sc.controller;

import com.sc.service.HelloRemote;
import com.sc.vo.BasicResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

    @Autowired
    HelloRemote helloRemote;

    @Value("${common.config.key1}")
    private String key1;

    @Value("${common.config.key2}")
    private String key2;

    @Value("${common.config.key3}")
    private String key3;

    @RequestMapping("/hello/{name}")
    public BasicResult index(@PathVariable("name") String name) {
        String hello = helloRemote.hello(name);
        String[] ss = {key1, key2, key3, hello};
        return BasicResult.success(ss);
    }
}
