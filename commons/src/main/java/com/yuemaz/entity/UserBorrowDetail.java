package com.yuemaz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author yuemaz
 * @Date 2022/4/16 22:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBorrowDetail {

    private User user;

    private List<Book> bookList;
}
