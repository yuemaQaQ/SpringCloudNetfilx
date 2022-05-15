package com.yuemaz.service.impl;

import com.yuemaz.client.BookClient;
import com.yuemaz.client.UserClient;
import com.yuemaz.entity.Book;
import com.yuemaz.entity.Borrow;
import com.yuemaz.entity.User;
import com.yuemaz.entity.UserBorrowDetail;
import com.yuemaz.mapper.BorrowMapper;
import com.yuemaz.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author yuemaz
 * @Date 2022/4/16 22:05
 */
@Service
public class BorrowServiceImpl implements BorrowService {

    @Autowired
    private BorrowMapper borrowMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private UserClient userClient;

    @Resource
    private BookClient bookClient;

    @Override
    public UserBorrowDetail getUserBorrowDetailByUid(int uid) {
        List<Borrow> borrowList = borrowMapper.getBorrowByUid(uid);

        User user = restTemplate.getForObject("http://userservice/user/getUser/" + uid, User.class);

        List<Book> bookList = borrowList
                .stream()
                .map(borrow -> restTemplate.getForObject("http://bookservice/book/getBook/" + borrow.getBid(), Book.class))
                .collect(Collectors.toList());
        return new UserBorrowDetail(user, bookList);
    }

    @Override
    public UserBorrowDetail getUserBorrowDetailFeignByUid(int uid) {
        List<Borrow> borrowList = borrowMapper.getBorrowByUid(uid);

        User user = userClient.getUserById(uid);
        List<Book> bookList = borrowList
                .stream()
                .map(borrow -> bookClient.getBookById(borrow.getBid()))
                .collect(Collectors.toList());
        return new UserBorrowDetail(user, bookList);
    }
}
