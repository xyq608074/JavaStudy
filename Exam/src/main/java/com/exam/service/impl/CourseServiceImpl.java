package com.exam.service.impl;

import com.exam.dao.CourseDao;
import com.exam.domain.Course;
import com.exam.service.CourseService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao;

    public void setCourseDao(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public List<Course> select() {
        return courseDao.select();
    }

    @Override
    public int add(Course course) {
        course.setCourseName(course.getCourseName());
        course.setCourseInfo(course.getCourseInfo());
        return courseDao.add(course);
    }

    @Override
    public Course findid(Course course) {
        course.setCourseId(course.getCourseId());
        return courseDao.findid(course);
    }

    @Override
    public void update(Course course) {
        courseDao.update(course);
    }

    //删除
    @Override
    public void delete(Course course) {
        course.setCourseId(course.getCourseId());
        courseDao.delete(course);
    }
}
