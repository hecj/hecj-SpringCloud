package com.hecj.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Value("${test}")
    private String test;

    @RequestMapping("/test")
    public String index() {
        return "配置文件:"+this.test;
    }
}