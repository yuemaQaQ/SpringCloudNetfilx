package com.yuemaz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yuemaz
 * @Date 2022/4/16 21:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private int bid;

    private String title;

    private String desc;
}
