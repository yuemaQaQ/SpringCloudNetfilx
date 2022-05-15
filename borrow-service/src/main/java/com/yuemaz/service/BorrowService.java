package com.yuemaz.service;

import com.yuemaz.entity.UserBorrowDetail;

/**
 * @Author yuemaz
 * @Date 2022/4/16 22:05
 */
public interface BorrowService {

    UserBorrowDetail getUserBorrowDetailByUid(int uid);

    UserBorrowDetail getUserBorrowDetailFeignByUid(int uid);
}
