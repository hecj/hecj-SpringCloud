package com.hecj.service.user.controller;

import com.hecj.service.user.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 **/
@RestController
public class UserController {

    @Autowired
    ServerConfig serverConfig;

    @RequestMapping("/api/user")
    public String user(){
        return serverConfig.getUrl()+"###"+ UserController.class.getName();
    }
}
