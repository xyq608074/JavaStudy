package com.ssh.dao.impl;

import com.ssh.dao.MessageDao;
import com.ssh.domain.Message;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class MessageDaoImpl extends HibernateDaoSupport implements MessageDao {
    @Override
    public void save(Message msg) {
        System.out.println(msg);
        System.out.println("MessageDaoImpl执行save...");
        this.getHibernateTemplate().save(msg);
    }
}
