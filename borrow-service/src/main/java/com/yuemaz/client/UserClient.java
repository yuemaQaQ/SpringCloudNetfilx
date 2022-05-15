package com.yuemaz.client;

import com.yuemaz.client.impl.UserFallbackClient;
import com.yuemaz.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author yuemaz
 * @Date 2022/4/18 22:13
 */
@FeignClient(value = "userservice", fallback = UserFallbackClient.class)
public interface UserClient {

    @GetMapping("/user/getUser/{uid}")
    User getUserById(@PathVariable int uid);
}
