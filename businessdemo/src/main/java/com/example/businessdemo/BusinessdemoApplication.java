package com.example.businessdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

//@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.example.businessdemo.mapper")
public class BusinessdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusinessdemoApplication.class, args);
    }

}

