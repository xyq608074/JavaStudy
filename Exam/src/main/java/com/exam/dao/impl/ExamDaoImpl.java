package com.exam.dao.impl;

import com.exam.dao.ExamDao;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class ExamDaoImpl extends HibernateDaoSupport implements ExamDao {

    @Override
    public void test() {
        System.out.println("dao");
    }
}
