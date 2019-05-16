package com.mybatis.one2many.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private int accid;
    private int accuid;
    private double accmoney;
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAccid() {
        return accid;
    }

    public void setAccid(int accid) {
        this.accid = accid;
    }

    public int getAccuid() {
        return accuid;
    }

    public void setAccuid(int accuid) {
        this.accuid = accuid;
    }

    public double getAccmoney() {
        return accmoney;
    }

    public void setAccmoney(double accmoney) {
        this.accmoney = accmoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accid=" + accid +
                ", accuid=" + accuid +
                ", accmoney=" + accmoney +
                '}';
    }
}
