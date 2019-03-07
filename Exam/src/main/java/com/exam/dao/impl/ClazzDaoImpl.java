package com.exam.dao.impl;

import com.exam.dao.ClazzDao;
import com.exam.domain.Clazz;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class ClazzDaoImpl extends HibernateDaoSupport implements ClazzDao {
    @Override
    public List<Clazz> classList(String clazz) {
        List<Clazz> classlist = (List<Clazz>) this.getHibernateTemplate().find("from Clazz where clsId in ("+clazz+")");
        return classlist;
    }
}
