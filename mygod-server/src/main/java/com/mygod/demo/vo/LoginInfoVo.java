package com.mygod.demo.vo;

import javax.validation.constraints.NotNull;

/**
 * @description Vue登录页面demo信息对象实体
 * @author sgc
 */
public class LoginInfoVo {

    @NotNull(message="用户名不允许为空")
    private String username;

    @NotNull(message="密码不允许为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
