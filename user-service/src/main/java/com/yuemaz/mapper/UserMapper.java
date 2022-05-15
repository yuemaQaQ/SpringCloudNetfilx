package com.yuemaz.mapper;

import com.yuemaz.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author yuemaz
 * @Date 2022/4/16 20:13
 */
@Mapper
public interface UserMapper {

    @Select("select * from db_user where uid = #{uid}")
    User getUserById(int uid);
}
