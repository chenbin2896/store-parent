package com.auction.store.order.feign;

import com.auction.store.order.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.xml.ws.Response;

/**
 * @author User
 * @date 2019/10/6
 * @description
 */
@FeignClient(value = "account")
public interface UserClient {

    @GetMapping(value = "/select/user/info/{uid}")
    Response<User> selectUserInfo(@PathVariable("uid") Integer uid);
}
