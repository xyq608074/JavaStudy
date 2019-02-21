package com.exam.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Class {
    private int clsId;
    private String clsName;
    private Integer clsNumpeople;
    private String clsAvgscore;
    private String clsTotalscore;

    @Id
    @Column(name = "cls_id")
    public int getClsId() {
        return clsId;
    }

    public void setClsId(int clsId) {
        this.clsId = clsId;
    }

    @Basic
    @Column(name = "cls_name")
    public String getClsName() {
        return clsName;
    }

    public void setClsName(String clsName) {
        this.clsName = clsName;
    }

    @Basic
    @Column(name = "cls_numpeople")
    public Integer getClsNumpeople() {
        return clsNumpeople;
    }

    public void setClsNumpeople(Integer clsNumpeople) {
        this.clsNumpeople = clsNumpeople;
    }

    @Basic
    @Column(name = "cls_avgscore")
    public String getClsAvgscore() {
        return clsAvgscore;
    }

    public void setClsAvgscore(String clsAvgscore) {
        this.clsAvgscore = clsAvgscore;
    }

    @Basic
    @Column(name = "cls_totalscore")
    public String getClsTotalscore() {
        return clsTotalscore;
    }

    public void setClsTotalscore(String clsTotalscore) {
        this.clsTotalscore = clsTotalscore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Class aClass = (Class) o;

        if (clsId != aClass.clsId) return false;
        if (clsName != null ? !clsName.equals(aClass.clsName) : aClass.clsName != null) return false;
        if (clsNumpeople != null ? !clsNumpeople.equals(aClass.clsNumpeople) : aClass.clsNumpeople != null)
            return false;
        if (clsAvgscore != null ? !clsAvgscore.equals(aClass.clsAvgscore) : aClass.clsAvgscore != null) return false;
        if (clsTotalscore != null ? !clsTotalscore.equals(aClass.clsTotalscore) : aClass.clsTotalscore != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clsId;
        result = 31 * result + (clsName != null ? clsName.hashCode() : 0);
        result = 31 * result + (clsNumpeople != null ? clsNumpeople.hashCode() : 0);
        result = 31 * result + (clsAvgscore != null ? clsAvgscore.hashCode() : 0);
        result = 31 * result + (clsTotalscore != null ? clsTotalscore.hashCode() : 0);
        return result;
    }
}
