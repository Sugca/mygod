package com.mygod.login.service;

import com.mygod.login.po.GmUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    GmUser getList();
}
