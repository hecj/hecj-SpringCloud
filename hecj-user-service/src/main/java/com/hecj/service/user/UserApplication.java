package com.hecj.service.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.hecj")
@ComponentScan(basePackages="com.hecj")
public class UserApplication {

    public static void main(String[] args) {
    	SpringApplication.run(UserApplication.class);
    }

}