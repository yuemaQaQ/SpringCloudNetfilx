package com.yuemaz.client;

import com.yuemaz.client.impl.BookFallbackClient;
import com.yuemaz.entity.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author yuemaz
 * @Date 2022/4/18 22:14
 */
@FeignClient(value = "bookservice", fallback = BookFallbackClient.class)
public interface BookClient {

    @GetMapping("/book/getBook/{bid}")
    Book getBookById(@PathVariable int bid);
}
