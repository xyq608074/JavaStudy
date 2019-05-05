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
        //读取配置文件
        InputStream ins = Resources.getResourceAsStream("DBConfig.xml");
        //创建SqlSessionFactory工厂
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = ssfb.build(ins);

        //使用工厂产生session对象
        SqlSession session = ssf.openSession();
        //使用SqlSession创建dao接口代理对象
        IStudentDao iStudentDao = session.getMapper(IStudentDao.class);

        //使用代理对象执行方法
        List<Student> findall = iStudentDao.findAll();

        for (Student stu : findall) {
            System.out.println(stu);
        }

        //释放
        session.close();
        ins.close();

    }
}
