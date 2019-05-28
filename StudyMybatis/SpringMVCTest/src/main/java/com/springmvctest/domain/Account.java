package com.springmvctest.domain;

import java.io.Serializable;

public class Account implements Serializable {

    private Integer accId;
    private Integer accUid;
    private Float accMoney;

    @Override
    public String toString() {
        return "Account{" +
                "accId=" + accId +
                ", accUid=" + accUid +
                ", accMoney=" + accMoney +
                '}';
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public Integer getAccUid() {
        return accUid;
    }

    public void setAccUid(Integer accUid) {
        this.accUid = accUid;
    }

    public Float getAccMoney() {
        return accMoney;
    }

    public void setAccMoney(Float accMoney) {
        this.accMoney = accMoney;
    }
}
