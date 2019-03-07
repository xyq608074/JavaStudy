package com.exam.dao;

import com.exam.domain.Student;
import org.apache.struts2.dispatcher.Parameter;

import java.util.List;

public interface StudentDao {
    Student login(Student student);

    List<Student> findAllClass(Parameter stuclass);

    int add(Student student);

    void delete(Student student);

    List<Student> findid(Student student);

    void update(Student student);
}
