package com.springexample.service;

import com.springexample.dao.SpringDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringService {
    public void save(){
        System.out.println("SpringService的save方法执行了...");

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-config.xml");
        SpringDao springDao = (SpringDao) applicationContext.getBean("SpringDao");
        springDao.save();
    }
}
