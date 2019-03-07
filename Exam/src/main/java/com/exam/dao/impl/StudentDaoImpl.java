package com.exam.dao.impl;

import com.exam.dao.StudentDao;
import com.exam.domain.Student;
import org.apache.struts2.dispatcher.Parameter;
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

    @Override
    public List<Student> findAllClass(Parameter stuclass) {
        List<Student> stulist = (List<Student>) this.getHibernateTemplate().find("from Student where stuClass=" + stuclass);
        return stulist;
    }

    @Override
    public int add(Student student) {
        Integer save = (Integer) this.getHibernateTemplate().save(student);
        if (save>0){
            return 1;
        }
        return 0;
    }

    @Override
    public void delete(Student student) {
        this.getHibernateTemplate().delete(student);
    }

    @Override
    public List<Student> findid(Student student) {
        return (List<Student>) this.getHibernateTemplate().find("from Student where stuId="+student.getStuId());
    }

    @Override
    public void update(Student student) {
        Student update = this.getHibernateTemplate().get(Student.class, student.getStuId());
        update.setStuUsername(student.getStuUsername());
        update.setStuPassword(student.getStuPassword());
        update.setStuClass(student.getStuClass());

        this.getHibernateTemplate().update(update);
    }
}
