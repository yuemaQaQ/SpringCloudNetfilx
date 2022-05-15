package com.yuemaz.controller;

import com.yuemaz.entity.User;
import com.yuemaz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yuemaz
 * @Date 2022/4/16 20:18
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser/{uid}")
    public User getUserById(@PathVariable int uid) {
        System.out.println("我被调用了");
        return userService.getUserById(uid);
    }
}
