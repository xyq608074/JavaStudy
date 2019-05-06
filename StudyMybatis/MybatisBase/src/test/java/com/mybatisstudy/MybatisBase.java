package com.mybatisstudy;

import com.mybatisstudy.dao.IStudentDao;
import com.mybatisstudy.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisBase {
    private InputStream ins;
    private SqlSession session;
    private IStudentDao studao;

    @Before //在测试方法之前执行
    public void init() throws IOException {
        //读取配置文件
        ins = Resources.getResourceAsStream("DBConfig.xml");
        //创建SqlSesstion工厂
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        SqlSessionFactory ssf = ssfb.build(ins);

        //使用工厂创建session对象
        session = ssf.openSession();
        studao = session.getMapper(IStudentDao.class);
    }

    @After //在测试方法之后执行
    public void destroy() throws IOException {
        session.commit();
        session.close();
        ins.close();
    }

    @Test //查找所有
    public void StuSelect(){
        //使用代理对象执行方法
        List<Student> stus = studao.findAll();

        for (Student stu:stus){
            System.out.println(stu);
        }
    }

    @Test
    public void saveStu(){
        Student stu=new Student();
        stu.setName("姓名");
        stu.setAge(19);
        stu.setAddr("在银河系中");

        studao.saveStu(stu);
    }

}
