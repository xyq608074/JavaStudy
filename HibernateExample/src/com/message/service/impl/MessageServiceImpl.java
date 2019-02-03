package com.message.service.impl;


import com.message.dao.MessageDao;
import com.message.dao.impl.MessageDaoImpl;
import com.message.domain.Message;
import com.message.service.MessageService;
import com.message.util.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class MessageServiceImpl implements MessageService {

    @Override
    public List<Message> messageSelect() {
        MessageDao messageDao = new MessageDaoImpl();
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List<Message> messages = messageDao.find();
        transaction.commit();
        return messages;
    }

    @Override
    public void messageadd(Message message) {
        MessageDao messageDao = new MessageDaoImpl();
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        messageDao.add(message);
        transaction.commit();
    }

    @Override
    public void del(int del) {
        MessageDao messageDao = new MessageDaoImpl();
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        messageDao.del(del);
        transaction.commit();
    }

    @Override
    public List messageFind(int updateid) {
        MessageDaoImpl messageDao = new MessageDaoImpl();
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List list = messageDao.find(updateid);
        transaction.commit();
        return list;
    }

    @Override
    public void update(Message message) {
        MessageDaoImpl messageDao = new MessageDaoImpl();
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        messageDao.update(message);
        transaction.commit();
    }


}
