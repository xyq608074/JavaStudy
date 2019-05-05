package login.dao.Impl;

import login.dao.LoginDao;
import login.domain.Student;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao {
    @Override
    public Student login(Student student) {
        System.out.println("LoginDaoImpl login");

        List<Student> loginlist = (List<Student>) this.getHibernateTemplate().findByCriteria(DetachedCriteria.forClass(Student.class)
                .add(Restrictions.and(Restrictions.eq("stuUsername", student.getStuUsername())
                        , Restrictions.eq("stuPassword", student.getStuPassword()))));
        System.out.println(loginlist.get(0));
        if (loginlist.size()>0){
            return loginlist.get(0);
        }
        return null;
    }
}
