package com.mybatisimpl.dao.impl;

import com.mybatisimpl.dao.IStudentDao;
import com.mybatisimpl.domain.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class StudentDaoImpl implements IStudentDao {
    private SqlSessionFactory ssf;

    public StudentDaoImpl(SqlSessionFactory ssf){
        this.ssf=ssf;
    }

    public List<Student> findAll() {
        SqlSession session = ssf.openSession();
        List<Student> selectList = session.selectList("com.mybatisimpl.dao.IStudentDao.findAll");
        session.close();
        return selectList;
    }

    public void saveStu(Student stu) {
        SqlSession session = ssf.openSession();
        session.insert("com.mybatisimpl.dao.IStudentDao.saveStu",stu);
        session.commit();
        session.close();
    }

    public void updateStu(Student stu) {
        SqlSession session =ssf.openSession();
        session.update("com.mybatisimpl.dao.IStudentDao.updateStu",stu);
        session.commit();
        session.close();
    }

    public void deleteStu(Integer id) {
        SqlSession session =ssf.openSession();
        session.delete("com.mybatisimpl.dao.IStudentDao.deleteStu",id);
        session.commit();
        session.close();
    }
}
