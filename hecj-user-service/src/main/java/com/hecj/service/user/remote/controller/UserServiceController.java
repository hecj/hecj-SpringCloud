package com.hecj.service.user.remote.controller;

import com.hecj.service.user.model.UsrUser;
import com.hecj.service.user.remote.UserServiceRemote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * 用户相关接口
 * 
 * @author hecj
 */
@RestController("accountUserServiceRemote")
public class UserServiceController implements UserServiceRemote {

	private static Logger log = LoggerFactory.getLogger(UserServiceController.class);

	@Autowired
    Environment env;

	/**
	 * 根据手机号查询(微服务接口)
	 * @return
	 * @throws IOException
	 */
	@Override
	public UsrUser findUserByUserId(@RequestParam("userId") String userId){
		UsrUser usrUser = new UsrUser();
		usrUser.setId(userId);
		return usrUser;
	}
	

}
