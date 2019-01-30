package com.message.dao.impl;

import com.message.dao.MessageDao;
import com.message.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import com.message.domain.Message;


public class MessageDaoImpl implements MessageDao {



    @Override
    public List<Message> find() {
        Session session = HibernateUtils.openSession();
        //HQL对象查询
        Query query = session.createQuery("from Message ");
        List<Message> list=query.list();
        session.close();
        return list;
    }

    @Override
    public void add(Message message) {
        Session session = HibernateUtils.openSession();
        session.save(message);
        session.close();
    }

    @Override
    public void del(int del) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        Message message = session.get(Message.class, del);
        session.delete(message);

        transaction.commit();
        session.close();
    }


}
