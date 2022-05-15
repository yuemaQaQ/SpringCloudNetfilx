package com.yuemaz.service.impl;

import com.yuemaz.entity.User;
import com.yuemaz.mapper.UserMapper;
import com.yuemaz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author yuemaz
 * @Date 2022/4/16 20:15
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int uid) {
        return userMapper.getUserById(uid);
    }
}
