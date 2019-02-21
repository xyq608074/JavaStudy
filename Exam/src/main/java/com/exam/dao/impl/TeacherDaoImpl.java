package com.exam.dao.impl;

import com.exam.dao.TeacherDao;
import com.exam.domain.Teacher;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class TeacherDaoImpl extends HibernateDaoSupport implements TeacherDao {


    @Override
    public int login(Teacher teacher) {
        System.out.println("TeacherDaoImpl login");
//        List<Teacher> thusername = (List<Teacher>) this.getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(Teacher.class)
//                .add(Restrictions.eq("thUsername", teacher.getThUsername())));
//        List<Teacher> thpassword = (List<Teacher>) this.getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(Teacher.class)
//                .add(Restrictions.eq("thPassword", teacher.getThPassword())));
        List<Teacher> loginlist = (List<Teacher>) this.getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(Teacher.class)
                .add(Restrictions.and(Restrictions.eq("thUsername", teacher.getThUsername())
                        , Restrictions.eq("thPassword", teacher.getThPassword()))));

        if (loginlist.size()>0){
            return 1;
        }
        return 0;
    }
}
