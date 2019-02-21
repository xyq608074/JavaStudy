package com.exam.service.impl;

import com.exam.dao.StudentDao;
import com.exam.domain.Student;
import com.exam.service.StudentService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void login(Student student) {
        studentDao.login(student);
    }
}
