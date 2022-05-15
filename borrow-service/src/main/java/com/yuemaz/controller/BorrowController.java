package com.yuemaz.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.yuemaz.entity.UserBorrowDetail;
import com.yuemaz.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

/**
 * @Author yuemaz
 * @Date 2022/4/16 22:07
 */
@RestController
@RequestMapping("/borrow")
public class BorrowController {

    @Autowired
    private BorrowService borrowService;

    @HystrixCommand(fallbackMethod = "onError")
    @GetMapping("/getUserBorrowsByUid/{uid}")
    public UserBorrowDetail getUserBorrowsByUid(@PathVariable int uid) {
        return borrowService.getUserBorrowDetailByUid(uid);
    }

    @GetMapping("/getUserBorrowsFeignByUid/{uid}")
    public UserBorrowDetail getUserBorrowsFeignByUid(@PathVariable int uid) {
        return borrowService.getUserBorrowDetailFeignByUid(uid);
    }

    //备选方案，这里直接返回空列表
    //注意参数和返回值要和上面一致
    UserBorrowDetail onError(int uid) {
        return new UserBorrowDetail(null, Collections.emptyList());
    }
}
