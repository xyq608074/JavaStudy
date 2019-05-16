package com.mybatis.one2many.domain;

import java.io.Serializable;

public class User implements Serializable {
    private int userid;
    private String username;
    private String useraddr;
    private String usersex;
    private String userbirthday;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseraddr() {
        return useraddr;
    }

    public void setUseraddr(String useraddr) {
        this.useraddr = useraddr;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUserbirthday() {
        return userbirthday;
    }

    public void setUserbirthday(String userbirthday) {
        this.userbirthday = userbirthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", useraddr='" + useraddr + '\'' +
                ", usersex='" + usersex + '\'' +
                ", userbirthday='" + userbirthday + '\'' +
                '}';
    }
}