package com.mybatis.one2many;

import com.mybatis.one2many.dao.IUserDao;
import com.mybatis.one2many.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class UserTest {
    private InputStream ins;
    private SqlSession ss;
    private IUserDao user;

    @Before
    public void init() throws Exception{
        //读取配置文件
        ins = Resources.getResourceAsStream("DBConfig.xml");
        //获取sqlsessionfactory
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(ins);
        //获取session对象
        ss = ssf.openSession(true);
        //获取代理对象
        user = ss.getMapper(IUserDao.class);
    }
    @After
    public void destory() throws Exception{
        ss.close();
        ins.close();
    }

    /**
     * 测试查询所有
     */
    @Test
    public void findUserAll(){
        List<User> users = user.findAll();
        for (User u:users){
            System.out.println(u);
            System.out.println(u.getAcc());
        }
    }
}
