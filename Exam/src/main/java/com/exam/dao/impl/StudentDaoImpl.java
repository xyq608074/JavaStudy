package com.exam.dao.impl;

import com.exam.dao.StudentDao;
import com.exam.domain.Student;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;


public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {
    @Override
    public void login(Student student) {

        //QBC写法
        List<Student> list = (List<Student>) this.getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(Student.class)
                .add(Restrictions.eq("stuUsername", student.getStuUsername())));

        //HQL写法
//        Session session = this.getHibernateTemplate().getSessionFactory().openSession();
//        List<Student> list = session.createQuery("from Student where stuUsername=?1")
//                .setParameter(1, student.getStuUsername())
//                .list();

        System.out.println(list);

        
    }
}
