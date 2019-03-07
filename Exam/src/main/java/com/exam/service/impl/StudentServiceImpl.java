package com.exam.service.impl;

import com.exam.dao.StudentDao;
import com.exam.domain.Student;
import com.exam.service.StudentService;
import org.apache.struts2.dispatcher.Parameter;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student login(Student student) {

        student.setStuUsername(student.getStuUsername());
        student.setStuPassword(student.getStuPassword());

        return studentDao.login(student);
    }

    @Override
    public List<Student> findAllByClass(Parameter stuclass) {
        return studentDao.findAllClass(stuclass);
    }

    @Override
    public int add(Student student) {
        student.setStuName(student.getStuName());
        student.setStuClass(student.getStuClass());
        student.setStuUsername(student.getStuUsername());
        student.setStuPassword(student.getStuPassword());

        return studentDao.add(student);
    }

    @Override
    public void delete(Student student) {
        studentDao.delete(student);
    }

    @Override
    public List<Student> findid(Student student) {
        student.setStuId(student.getStuId());
        return studentDao.findid(student);
    }

    @Override
    public void update(Student student) {
        studentDao.update(student);
    }


}
