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

    @Test  //保存
    public void saveStu(){
        Student stu=new Student();
        stu.setName("姓名1");
        stu.setAge(91);
        stu.setAddr("在银河系中11");
        studao.saveStu(stu);
    }

    @Test  //修改
    public void updateStu(){
        Student stu=new Student();
        stu.setId(5);
        stu.setName("银河222");
        stu.setAge(23);
        stu.setAddr("321");

        studao.updateStu(stu);
    }

    @Test //删除
    public void deleteStu(){
        studao.deleteStu(14);
    }

    @Test //查找一条
    public void findById(){
        Student stu=studao.selectById(13);
        System.out.println(stu);
    }

    @Test //模糊查询
    public void fuzzySelect(){
        List<Student> stus = studao.fuzzySelect("%银%");
        for (Student stu:stus){
            System.out.println(stu);
        }
    }

    @Test //查询总条数
    public void findTotal(){
        int total = studao.findTotal();
        System.out.println(total);
    }

}
