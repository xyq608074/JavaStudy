package com.exam.domain;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    private int stuId;
    private String stuName;
    private Integer stuClass;
    private String stuUsername;
    private String stuPassword;

    @Id
    @Column(name = "stu_id")
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Basic
    @Column(name = "stu_name")
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    @Basic
    @Column(name = "stu_class")
    public Integer getStuClass() {
        return stuClass;
    }

    public void setStuClass(Integer stuClass) {
        this.stuClass = stuClass;
    }

    @Basic
    @Column(name = "stu_username")
    public String getStuUsername() {
        return stuUsername;
    }

    public void setStuUsername(String stuUsername) {
        this.stuUsername = stuUsername;
    }

    @Basic
    @Column(name = "stu_password")
    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (stuId != student.stuId) return false;
        if (stuName != null ? !stuName.equals(student.stuName) : student.stuName != null) return false;
        if (stuClass != null ? !stuClass.equals(student.stuClass) : student.stuClass != null) return false;
        if (stuUsername != null ? !stuUsername.equals(student.stuUsername) : student.stuUsername != null) return false;
        if (stuPassword != null ? !stuPassword.equals(student.stuPassword) : student.stuPassword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stuId;
        result = 31 * result + (stuName != null ? stuName.hashCode() : 0);
        result = 31 * result + (stuClass != null ? stuClass.hashCode() : 0);
        result = 31 * result + (stuUsername != null ? stuUsername.hashCode() : 0);
        result = 31 * result + (stuPassword != null ? stuPassword.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuName='" + stuName + '\'' +
                ", stuClass=" + stuClass +
                ", stuUsername='" + stuUsername + '\'' +
                ", stuPassword='" + stuPassword + '\'' +
                '}';
    }
}
