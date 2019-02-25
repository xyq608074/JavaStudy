package com.exam.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
    private int thId;
    private String thName;
    private String thUsername;
    private String thPassword;
    private String thClass;

    @Id
    @Column(name = "th_id")
    public int getThId() {
        return thId;
    }

    public void setThId(int thId) {
        this.thId = thId;
    }

    @Basic
    @Column(name = "th_name")
    public String getThName() {
        return thName;
    }

    public void setThName(String thName) {
        this.thName = thName;
    }

    @Basic
    @Column(name = "th_username")
    public String getThUsername() {
        return thUsername;
    }

    public void setThUsername(String thUsername) {
        this.thUsername = thUsername;
    }

    @Basic
    @Column(name = "th_password")
    public String getThPassword() {
        return thPassword;
    }

    public void setThPassword(String thPassword) {
        this.thPassword = thPassword;
    }

    @Basic
    @Column(name = "th_class")
    public String getThClass() {
        return thClass;
    }

    public void setThClass(String thClass) {
        this.thClass = thClass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Teacher teacher = (Teacher) o;

        if (thId != teacher.thId) return false;
        if (thName != null ? !thName.equals(teacher.thName) : teacher.thName != null) return false;
        if (thUsername != null ? !thUsername.equals(teacher.thUsername) : teacher.thUsername != null) return false;
        if (thPassword != null ? !thPassword.equals(teacher.thPassword) : teacher.thPassword != null) return false;
        if (thClass != null ? !thClass.equals(teacher.thClass) : teacher.thClass != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = thId;
        result = 31 * result + (thName != null ? thName.hashCode() : 0);
        result = 31 * result + (thUsername != null ? thUsername.hashCode() : 0);
        result = 31 * result + (thPassword != null ? thPassword.hashCode() : 0);
        result = 31 * result + (thClass != null ? thClass.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "thId=" + thId +
                ", thName='" + thName + '\'' +
                ", thUsername='" + thUsername + '\'' +
                ", thPassword='" + thPassword + '\'' +
                ", thClass='" + thClass + '\'' +
                '}';
    }
}
