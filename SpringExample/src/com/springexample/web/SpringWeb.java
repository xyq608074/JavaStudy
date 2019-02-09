package com.springexample.web;


import com.springexample.service.SpringService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringWeb {
    @Test
    public void demo(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-config.xml");
        SpringService springService = (SpringService) applicationContext.getBean("SpringService");
        springService.save();
    }
}
