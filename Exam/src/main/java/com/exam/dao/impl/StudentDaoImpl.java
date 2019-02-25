package com.exam.dao.impl;

import com.exam.dao.StudentDao;
import com.exam.domain.Student;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;


public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {
    @Override
    public Student login(Student student) {
        List<Student> loginlist = (List<Student>) this.getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(Student.class)
                .add(Restrictions.and(Restrictions.eq("stuUsername", student.getStuUsername())
                        , Restrictions.eq("stuPassword", student.getStuPassword()))));
        if (loginlist.size()>0){
            return loginlist.get(0);
        }
        return null;
    }
}
