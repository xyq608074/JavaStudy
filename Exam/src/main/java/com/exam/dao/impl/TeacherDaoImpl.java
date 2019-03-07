package com.exam.dao.impl;

import com.exam.dao.TeacherDao;
import com.exam.domain.Clazz;
import com.exam.domain.Teacher;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class TeacherDaoImpl extends HibernateDaoSupport implements TeacherDao {


    @Override
    public Teacher login(Teacher teacher) {
        List<Teacher> loginlist = this.getHibernateTemplate().findByExample(teacher);
        if (loginlist.size()>0){
            return loginlist.get(0);
        }
        return null;
    }

    @Override
    public List<Clazz> classlist(String thclass) {

        List<Clazz> classlist = (List<Clazz>) this.getHibernateTemplate().find("from Clazz where clsId in (" + thclass + ")");

        return classlist;
    }
}
