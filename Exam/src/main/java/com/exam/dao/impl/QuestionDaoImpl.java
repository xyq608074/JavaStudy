package com.exam.dao.impl;

import com.exam.dao.QuestionDao;
import com.exam.domain.PageBean;
import com.exam.domain.Questions;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.io.Serializable;
import java.util.List;

public class QuestionDaoImpl extends HibernateDaoSupport implements QuestionDao {
    @Override
    public List<Questions> select(String questions) {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Questions.class);
        List<Questions> qslist = (List<Questions>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
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

//    @Override
//    public PageBean<Questions> randselect(Questions questions, Integer currentPage) {
//        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Questions.class);
////        detachedCriteria.add(Restrictions.sqlRestriction("qs_course=1 order by rand()"));
//        PageBean<Questions> examlist = (PageBean<Questions>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
//        return examlist;
//    }

    @Override
    public Integer randselectcount(DetachedCriteria detachedCriteria) {
        detachedCriteria.setProjection(Projections.rowCount());
        List<Long> count = (List<Long>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
        return count.get(0).intValue();
    }

    @Override
    public List<Questions> randselect(DetachedCriteria detachedCriteria, Integer begin, Integer pageSize) {
        detachedCriteria.setProjection(null);
//        detachedCriteria.add(Restrictions.sqlRestriction("qs_course=1 order by rand()"));
        List<Questions> examlist = (List<Questions>) this.getHibernateTemplate().findByCriteria(detachedCriteria,begin,pageSize );
        return examlist;
    }
}
