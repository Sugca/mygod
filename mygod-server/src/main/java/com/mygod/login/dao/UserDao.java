package com.mygod.login.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mygod.login.po.GmUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao extends BaseMapper<GmUser> {

}
