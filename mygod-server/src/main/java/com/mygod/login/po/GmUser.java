package com.mygod.login.po;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

@TableName(value = "gm_user")
public class GmUser implements Serializable {

    private int id;
    private String username; // 登录用户名
    private String password; // 登录密码
    private String reserve1; // 预留字段1
    private String reserve2; // 预留字段2
    private String reserve3; // 预留字段3
    private String createtime; // 创建时间
    private String modifytime; // 更新时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1;
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2;
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getModifytime() {
        return modifytime;
    }

    public void setModifytime(String modifytime) {
        this.modifytime = modifytime;
    }

    public GmUser() {
    }

    public GmUser(int id, String username, String password, String reserve1, String reserve2, String reserve3, String createtime, String modifytime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.reserve1 = reserve1;
        this.reserve2 = reserve2;
        this.reserve3 = reserve3;
        this.createtime = createtime;
        this.modifytime = modifytime;
    }

    @Override
    public String toString() {
        return "GmUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", reserve1='" + reserve1 + '\'' +
                ", reserve2='" + reserve2 + '\'' +
                ", reserve3='" + reserve3 + '\'' +
                ", createtime='" + createtime + '\'' +
                ", modifytime='" + modifytime + '\'' +
                '}';
    }
}
