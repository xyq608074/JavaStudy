package com.hibernate.test;


import com.hibernate.domain.Message;
import com.hibernate.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Demo {
    @Test
    //增
    public void insert(){
        Configuration conf= new Configuration().configure();
        SessionFactory sf = conf.buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();

        Message msg=new Message();
        msg.setName("hibernate");
        msg.setMessage("hibernate");
        Date date =new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String format = sdf.format(date);
        msg.setMsgtime(format);

        session.save(msg);


        transaction.commit();

        session.close();
        sf.close();
    }

    @Test
    //查询
    public void select(){
        Configuration conf= new Configuration().configure();
        SessionFactory sf = conf.buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();


        //根据id查询一条
        Message message = session.get(Message.class, 110);
        System.out.println(message);


        //查询所有
        Query from_message = session.createQuery("from Message");

        List<Message> list= from_message.list();
        System.out.println(list);


        transaction.commit();

        session.close();
        sf.close();
    }

    @Test
    //通过工具类查找
    public void utilselect(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();

        //根据id查询一条
        Message message = session.get(Message.class, 110);
        System.out.println(message);

        //查询所有
        Query from_message = session.createQuery("from Message");

        List<Message> list= from_message.list();
        System.out.println(list);

        transaction.commit();

        session.close();
    }

    @Test
    //修改
    public void update(){
        Configuration conf= new Configuration().configure();
        SessionFactory sf = conf.buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();


        //先查出来一个要修改的对象
        Message message = session.get(Message.class, 110);
        //修改要修改的信息
        message.setName("我是修改后的Hibernate");
        //执行修改
        session.update(message);



        transaction.commit();

        session.close();
        sf.close();
    }


    @Test
    //删除
    public void delete(){
        Configuration conf= new Configuration().configure();
        SessionFactory sf = conf.buildSessionFactory();

        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction();


        //先查出来一个要修改的对象
        Message message = session.get(Message.class, 123);
        //执行修改
        session.delete(message);


        transaction.commit();

        session.close();
        sf.close();
    }
}
