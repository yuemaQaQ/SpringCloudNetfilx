package com.yuemaz.controller;

import com.yuemaz.entity.Book;
import com.yuemaz.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author yuemaz
 * @Date 2022/4/16 21:56
 */
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/getBook/{bid}")
    public Book getBookById(@PathVariable int bid,
                            HttpServletRequest request) {
        System.out.println(request.getHeader("Test"));
        return bookService.getBookById(bid);
    }
}
