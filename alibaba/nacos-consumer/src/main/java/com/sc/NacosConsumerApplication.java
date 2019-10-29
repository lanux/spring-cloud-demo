package com.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
public class NacosConsumerApplication {


    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerApplication.class, args);
    }
}
