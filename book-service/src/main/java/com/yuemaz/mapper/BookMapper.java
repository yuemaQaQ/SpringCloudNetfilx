package com.yuemaz.mapper;

import com.yuemaz.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author yuemaz
 * @Date 2022/4/16 21:52
 */
@Mapper
public interface BookMapper {

    @Select("select * from db_book where bid = #{bid}")
    Book getBookById(int bid);
}
