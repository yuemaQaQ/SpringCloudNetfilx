package com.yuemaz.client.impl;

import com.yuemaz.client.BookClient;
import com.yuemaz.entity.Book;
import org.springframework.stereotype.Component;

/**
 * @Author yuemaz
 * @Date 2022/4/24 21:44
 */
@Component
public class BookFallbackClient implements BookClient {
    @Override
    public Book getBookById(int bid) {
        Book book = new Book();
        book.setTitle("我是补救措施");
        return book;
    }
}
