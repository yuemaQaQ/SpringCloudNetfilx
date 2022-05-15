package com.yuemaz.service.impl;

import com.yuemaz.entity.Book;
import com.yuemaz.mapper.BookMapper;
import com.yuemaz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author yuemaz
 * @Date 2022/4/16 21:55
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Book getBookById(int bid) {
        return bookMapper.getBookById(bid);
    }
}
