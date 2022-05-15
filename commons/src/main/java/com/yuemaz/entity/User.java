package com.yuemaz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author yuemaz
 * @Date 2022/4/16 20:11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int uid;

    private String name;

    private String sex;
}
