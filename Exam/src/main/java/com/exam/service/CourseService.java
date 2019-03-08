package com.exam.service;

import com.exam.domain.Course;

import java.util.List;

public interface CourseService {
    List<Course> select();

    int add(Course course);

    Course findid(Course course);

    void update(Course course);

    void delete(Course course);
}
