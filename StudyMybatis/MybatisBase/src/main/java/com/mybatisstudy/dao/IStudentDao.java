package com.mybatisstudy.dao;

import com.mybatisstudy.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IStudentDao {

    @Select("select * from stu_student")
    List<Student> findAll();


    @Insert("insert into stu_student (name,age,addr) values(#{name},#{age},#{addr})")
    void saveStu(Student stu);
}
