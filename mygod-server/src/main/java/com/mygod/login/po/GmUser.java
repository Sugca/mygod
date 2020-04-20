package com.mygod.login.po;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@TableName(value = "user")
public class GmUser implements Serializable {

    private int id;
    private String username; // 登录用户名
    private String password; // 登录密码
    private String reserve1; // 预留字段1
    private String reserve2; // 预留字段2
    private String reserve3; // 预留字段3
    private String createtime; // 创建时间
    private String modifytime; // 更新时间

}
