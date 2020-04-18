package com.mygod.login.service.impl;

import com.mygod.login.dao.UserDao;
import com.mygod.login.po.GmUser;
import com.mygod.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public GmUser getList() {
        GmUser gmUser = userDao.selectById(1);
        return gmUser;
    }

}
