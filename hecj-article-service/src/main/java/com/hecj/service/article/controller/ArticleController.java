package com.hecj.service.article.controller;

import com.hecj.service.article.config.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 **/
@RestController
public class ArticleController {

    @Autowired
    ServerConfig serverConfig;

    @RequestMapping("/api/article")
    public String article(){
        return serverConfig.getUrl()+"###"+ ArticleController.class.getName();
    }

}
