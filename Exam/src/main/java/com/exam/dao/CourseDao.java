package com.exam.dao;

import com.exam.domain.Course;

import java.util.List;

public interface CourseDao {
    List<Course> select();

    int add(Course course);

    Course findid(Course course);

    void update(Course course);

    void delete(Course course);
}
