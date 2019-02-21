package com.exam.service.impl;

import com.exam.dao.TeacherDao;
import com.exam.domain.Teacher;
import com.exam.service.TeacherService;

public class TeacherServiceImpl implements TeacherService {

    private TeacherDao teacherDao;

    public void setTeacherDao(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public int login(Teacher teacher) {
        return teacherDao.login(teacher);
    }
}
