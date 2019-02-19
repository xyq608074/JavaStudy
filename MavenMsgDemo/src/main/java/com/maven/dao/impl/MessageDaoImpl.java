package com.maven.dao.impl;

import com.maven.dao.MessageDao;
import com.maven.domain.Msg;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class MessageDaoImpl extends HibernateDaoSupport implements MessageDao {
    @Override
    public void save(Msg msg) {
        System.out.println("MessageDaoImpl save");
        this.getHibernateTemplate().save(msg);
    }

    @Override
    public List<Msg> findAll() {
        System.out.println("MessageDaoImpl findall");
        List<Msg> msglist = (List<Msg>) this.getHibernateTemplate().find("from Msg order by id desc ");
        return msglist;
    }
}
