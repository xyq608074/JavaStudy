package com.exam.dao.impl;

import com.exam.dao.QuestionDao;
import com.exam.domain.Questions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

public class QuestionDaoImpl extends HibernateDaoSupport implements QuestionDao {
    @Override
    public List<Questions> select(String questions) {
        List<Questions> qslist = (List<Questions>) this.getHibernateTemplate().find("from Questions where qsCourse="+questions);
        return qslist;
    }

    @Override
    public Integer add(Questions questions) {
        Serializable save = this.getHibernateTemplate().save(questions);
        return (Integer)save;
    }

    //删除考题
    @Override
    public void delete(Questions questions) {
        this.getHibernateTemplate().delete(questions);
    }

    //查询一条
    @Override
    public Questions findid(Questions questions) {
        Questions findqs = this.getHibernateTemplate().get(Questions.class, questions.getQsId());
        return findqs;
    }

    //update
    @Override
    public void update(Questions questions) {
        Questions qs = this.getHibernateTemplate().get(Questions.class, questions.getQsId());
        qs.setQsId(questions.getQsId());
        qs.setQsTitle(questions.getQsTitle());
        qs.setQsA(questions.getQsA());
        qs.setQsB(questions.getQsB());
        qs.setQsC(questions.getQsC());
        qs.setQsD(questions.getQsD());
        qs.setQsAnswer(questions.getQsAnswer());
        qs.setQsCourse(questions.getQsCourse());

        this.getHibernateTemplate().update(qs);
    }
}
