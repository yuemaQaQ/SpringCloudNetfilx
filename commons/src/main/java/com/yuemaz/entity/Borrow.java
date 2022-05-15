package com.yuemaz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yuemaz
 * @Date 2022/4/16 22:00
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Borrow {

    private int id;

    private int uid;

    private int bid;
}
