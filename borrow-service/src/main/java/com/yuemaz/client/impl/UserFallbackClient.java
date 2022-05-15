package com.yuemaz.client.impl;

import com.yuemaz.client.UserClient;
import com.yuemaz.entity.User;
import org.springframework.stereotype.Component;

/**
 * @Author yuemaz
 * @Date 2022/4/24 21:26
 */
@Component
public class UserFallbackClient implements UserClient {
    @Override
    public User getUserById(int uid) {
        User user = new User();
        user.setName("我是补救措施");
        return user;
    }
}
