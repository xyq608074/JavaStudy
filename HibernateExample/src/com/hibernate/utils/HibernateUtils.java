package com.hibernate.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {

    //创建SessionFactory对象
    private static SessionFactory sf=null;

    static{
        //创建空参构造
        Configuration conf= new Configuration().configure();
        //根据conf 创建SessionFactory对象
        sf= conf.buildSessionFactory();
    }

    //获得session
    public static Session openSession(){
        Session session = sf.openSession();
        return session;
    }

    //获得当前session
    public static Session getCurrentSession(){
        Session session = sf.getCurrentSession();
        return session;
    }

}
