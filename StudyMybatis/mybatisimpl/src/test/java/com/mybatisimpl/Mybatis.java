package com.mybatisimpl;

import com.mybatisimpl.dao.IStudentDao;
import com.mybatisimpl.dao.impl.StudentDaoImpl;
import com.mybatisimpl.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class Mybatis {

    private InputStream ins;
    private IStudentDao studao;

    @Before
    public void init() throws Exception{
        ins = Resources.getResourceAsStream("DBConfig.xml");
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(ins);
        studao= new StudentDaoImpl(ssf);
    }

    @After
    public void destroy() throws Exception{
        ins.close();
    }

    @Test
    public void findAll(){
        List<Student> stuall = studao.findAll();
        for (Student stu: stuall){
            System.out.println(stu);
        }
    }

    @Test
    public void saveStu(){
        Student s=new Student();
        s.setName("李哈哈");
        s.setAge(20);
        s.setAddr("C-37");
        studao.saveStu(s);
    }

    @Test
    public void updateStu(){
        Student s=new Student();
        s.setId(19);
        s.setName("燕子李三");
        s.setAge(20);
        s.setAddr("C-45");
        studao.updateStu(s);
    }

    @Test
    public void deleteStu(){
        studao.deleteStu(19);
    }

}
