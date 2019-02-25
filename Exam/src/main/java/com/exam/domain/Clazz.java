package com.exam.domain;

import javax.persistence.*;

@Entity
@Table(name = "class", schema = "exam", catalog = "")
public class Clazz {
    private int clsId;
    private String clsName;
    private Integer clsNumpeople;
    private String clsAvgscore;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Clazz clazz = (Clazz) o;

        if (clsId != clazz.clsId) return false;
        if (clsName != null ? !clsName.equals(clazz.clsName) : clazz.clsName != null) return false;
        if (clsNumpeople != null ? !clsNumpeople.equals(clazz.clsNumpeople) : clazz.clsNumpeople != null) return false;
        if (clsAvgscore != null ? !clsAvgscore.equals(clazz.clsAvgscore) : clazz.clsAvgscore != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clsId;
        result = 31 * result + (clsName != null ? clsName.hashCode() : 0);
        result = 31 * result + (clsNumpeople != null ? clsNumpeople.hashCode() : 0);
        result = 31 * result + (clsAvgscore != null ? clsAvgscore.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "clsId=" + clsId +
                ", clsName='" + clsName + '\'' +
                ", clsNumpeople=" + clsNumpeople +
                ", clsAvgscore='" + clsAvgscore + '\'' +
                '}';
    }
}
