package com.hecj.service.article.controller;

import com.hecj.service.user.model.UsrUser;
import com.hecj.service.user.remote.UserServiceRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 **/
@RestController
public class FeignClientController {

    @Autowired
    UserServiceRemote userServiceRemote;

    @RequestMapping("/api/article/feign")
    public UsrUser articleFeign(){
        return userServiceRemote.findUserByUserId("001");
    }
}
