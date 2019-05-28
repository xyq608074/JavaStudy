package com.stringtest.test;

import com.stringtest.domain.Account;
import com.stringtest.service.IAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringTest {

    //获取配置文件
    ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
    //得到业务层方法
    IAccountService ias = ac.getBean("accountService", IAccountService.class);

    @Test  //查询所有
    public void testFindAll(){
        //执行方法
        List<Account> allAccount = ias.findAllAccount();
        for (Account acc:allAccount){
            System.out.println(acc);
        }
    }

    @Test //通过id查询
    public void testFindOne(){
        Account accountById = ias.findAccountById(1);
        System.out.println(accountById);
    }

    @Test  //保存
    public void testSaveAcc(){
        Account acc=new Account();
        acc.setName("李四");
        acc.setMoney(123f);
        ias.saveAccount(acc);
    }

    @Test  //修改
    public void testUpdateAcc(){
        Account acc=new Account();
        acc.setId(3);
        acc.setName("王五");
        acc.setMoney(456f);
        ias.updateAccount(acc);
    }

    @Test  //删除
    public void testDeleteAcc(){
        ias.deleteAccount(4);
    }

    @Test  //转账
    public void testTransfer(){
        ias.transfer("张三丰","李四",500f);
    }
}
