package com.exam.dao.impl;

import com.exam.dao.TeacherDao;
import com.exam.domain.Clazz;
import com.exam.domain.Teacher;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class TeacherDaoImpl extends HibernateDaoSupport implements TeacherDao {


    @Override
    public Teacher login(Teacher teacher) {
        System.out.println("TeacherDaoImpl login");
//        List<Teacher> loginlist = (List<Teacher>) this.getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(Teacher.class)
//                .add(Restrictions.and(Restrictions.eq("thUsername", teacher.getThUsername())
//                        , Restrictions.eq("thPassword", teacher.getThPassword()))));

        List<Teacher> loginlist = this.getHibernateTemplate().findByExample(teacher);
        if (loginlist.size()>0){
            return loginlist.get(0);
        }
        return null;
    }

    @Override
    public List<Clazz> classlist(String thclass) {
//        List<Clazz> classlist=new ArrayList<Clazz>();

//        for (int i=0;i<chars.length;i++){
//            List<Clazz> list = (List<Clazz>) this.getHibernateTemplate().find("from Clazz where clsId=" + chars[i]);
//            Clazz cls = classlist.get(0);
//        }
        List<Clazz> classlist = (List<Clazz>) this.getHibernateTemplate().find("from Clazz where clsId in (" + thclass + ")");

        return classlist;
    }
}
