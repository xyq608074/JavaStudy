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

    public List find(int id) {
        Session session = HibernateUtils.openSession();
        Query query = session.createQuery("from Message where id=:mid");
        query.setParameter("mid",id);
        List list = query.list();
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

    @Override
    public void update(Message message) {
        Session session = HibernateUtils.openSession();
        Transaction transaction = session.beginTransaction();
        Message msg = session.get(Message.class, message.getId());
        msg.setName(message.getName());
        msg.setMessage(message.getMessage());
        session.update(msg);
        transaction.commit();
        session.close();
    }


}
