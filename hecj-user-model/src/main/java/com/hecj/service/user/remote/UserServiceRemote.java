package com.hecj.service.user.remote;
import com.hecj.service.user.model.UsrUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
/**
 * 用户相关服务接口
 * @author hecj
 */
public interface UserServiceRemote {

	/**
	 * 用户id查询(微服务接口)
	 * @throws IOException
	 */
	@RequestMapping("/service/user/userId")
	UsrUser findUserByUserId(@RequestParam("userId") String userId);

}
