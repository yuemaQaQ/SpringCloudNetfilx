package com.yuemaz.mapper;

import com.yuemaz.entity.Borrow;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author yuemaz
 * @Date 2022/4/16 22:02
 */
@Mapper
public interface BorrowMapper {

    @Select("select * from db_borrow where uid = #{uid}")
    List<Borrow> getBorrowByUid(int uid);

    @Select("select * from db_borrow where bid = #{bid}")
    List<Borrow> getBorrowByBid(int bid);

    @Select("select * from db_borrow where uid = #{uid} and bid = #{bid}")
    Borrow getBorrow(int uid, int bid);
}
