package login.service.Impl;

import login.dao.LoginDao;
import login.domain.Student;
import login.service.LoginService;

public class LoginServiceImpl implements LoginService {

    private LoginDao loginDao;
    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    @Override
    public Student login(Student student) {
        System.out.println("LoginServiceImpl login");
        student.setStuUsername(student.getStuUsername());
        student.setStuPassword(student.getStuPassword());
        return loginDao.login(student);
    }
}
