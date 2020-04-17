package com.mygod.login.service.impl;

import com.mygod.login.dao.UserDao;
import com.mygod.login.po.GmUser;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserDao userDao;

    @Test
    void getList() {
        GmUser gmUser = userDao.selectById(1);
        System.out.println(gmUser);
    }
}