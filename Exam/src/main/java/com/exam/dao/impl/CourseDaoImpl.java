package com.exam.dao.impl;

import com.exam.dao.CourseDao;
import com.exam.domain.Course;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class CourseDaoImpl extends HibernateDaoSupport implements CourseDao{

    public List<Course> select() {
        List<Course> courselist = (List<Course>) this.getHibernateTemplate().find("from Course");
        return courselist;
    }

    @Override
    public int add(Course course) {
        Integer save = (Integer) this.getHibernateTemplate().save(course);

        if (save>0){
            return save;
        }
       return 0;
    }

    @Override
    public Course findid(Course course) {
        Course findid = this.getHibernateTemplate().get(Course.class, course.getCourseId());
        return findid;
    }

    @Override
    public void update(Course course) {
        Course find = this.getHibernateTemplate().get(Course.class, course.getCourseId());
        find.setCourseName(course.getCourseName());
        find.setCourseInfo(course.getCourseInfo());
        this.getHibernateTemplate().update(find);
    }

    //删除
    @Override
    public void delete(Course course) {
        System.out.println(course);
        this.getHibernateTemplate().delete(course);
    }
}
