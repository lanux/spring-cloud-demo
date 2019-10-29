package com.sc.hystrix;

import com.sc.service.HelloRemote;
import org.springframework.stereotype.Component;

@Component
public class HelloRemoteHystrix implements HelloRemote {

    @Override
    public String hello(String name) {
        return "请求超时了";
    }
}
