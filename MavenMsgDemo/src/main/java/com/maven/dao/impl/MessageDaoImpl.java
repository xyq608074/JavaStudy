package com.maven.dao.impl;

import com.maven.dao.MessageDao;
import com.maven.domain.Msg;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class MessageDaoImpl extends HibernateDaoSupport implements MessageDao {

    /*保存方法*/
    @Override
    public void save(Msg msg) {
        System.out.println("MessageDaoImpl save");
        this.getHibernateTemplate().save(msg);
    }
    /*查询所有方法*/
    @Override
    public List<Msg> findAll() {
        System.out.println("MessageDaoImpl findall");
        List<Msg> msglist = (List<Msg>) this.getHibernateTemplate().find("from Msg order by id desc ");
        return msglist;
    }

    //删除
    @Override
    public void delete(Msg msg) {
        System.out.println("MessageDaoImpl delete");
        System.out.println(msg);
        this.getHibernateTemplate().delete(msg);
    }

    //查询一条
    @Override
    public List<Msg> find(Msg msg) {
        System.out.println("MessageDaoImpl find");
        List<Msg> msglist = (List<Msg>) this.getHibernateTemplate().find("from Msg where id="+msg.getId());
        return msglist;
    }

    //修改
    @Override
    public void update(Msg msg) {
        System.out.println("MessageDaoImpl update");
        this.getHibernateTemplate().update(msg);
        System.out.println(msg);
    }
}
