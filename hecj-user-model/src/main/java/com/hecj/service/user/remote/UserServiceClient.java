package com.hecj.service.user.remote;

import com.hecj.service.user.model.UsrUser;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(value="hecj-user-service",fallback = UserServiceClient.UserServiceClientError.class)
public interface UserServiceClient extends UserServiceRemote{

    @Component
    class UserServiceClientError implements UserServiceClient{
        @Override
        public UsrUser findUserByUserId(String userId) {
            UsrUser user = new UsrUser();
            user.setId("xxxxx");
            return user;
        }
    }
}
