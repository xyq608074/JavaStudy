package com.mybatis.test;

import com.mybatis.dao.IStudentDao;
import com.mybatis.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    public static void main(String[] args) throws Exception {
        InputStream ins = Resources.getResourceAsStream("DBConfig.xml");
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = ssfb.build(ins);

        //使用工厂产生session对象
        SqlSession session = ssf.openSession();

        IStudentDao iStudentDao = session.getMapper(IStudentDao.class);

        List<Student> findall = iStudentDao.findAll();

        for (Student stu : findall) {
            System.out.println(stu);
        }
        session.close();
        ins.close();


        //mysql时区有问题  set global time_zone='+08:00';
    }
}
