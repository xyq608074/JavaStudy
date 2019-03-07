package com.exam.service.impl;

import com.exam.dao.TeacherDao;
import com.exam.domain.Clazz;
import com.exam.domain.Teacher;
import com.exam.service.TeacherService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class TeacherServiceImpl implements TeacherService {

    private TeacherDao teacherDao;

    public void setTeacherDao(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public Teacher login(Teacher teacher) {
        teacher.setThUsername(teacher.getThUsername());
        teacher.setThPassword(teacher.getThPassword());

        return teacherDao.login(teacher);
    }

    @Override
    public List<Clazz> classlist(String thclass) {
       return teacherDao.classlist(thclass);
    }
}
