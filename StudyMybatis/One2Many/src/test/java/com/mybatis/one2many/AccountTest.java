package com.mybatis.one2many;

import com.mybatis.one2many.dao.IAccountDao;
import com.mybatis.one2many.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class AccountTest {
    private InputStream ins;
    private SqlSession ss;
    private IAccountDao acc;

    @Before
    public void init() throws Exception{
        //读取配置文件
        ins = Resources.getResourceAsStream("DBConfig.xml");
        //获取sqlsessionfactory
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(ins);
        //获取session对象
        ss = ssf.openSession(true);
        //获取代理对象
        acc = ss.getMapper(IAccountDao.class);
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
    public void findAll(){
        List<Account> accs=acc.findAll();
        for (Account acc:accs){
            System.out.println(acc);
            System.out.println(acc.getUser());
        }
    }
}
