package login.web;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import login.domain.Student;
import login.service.LoginService;

public class Login extends ActionSupport implements ModelDriven<Student> {

    Student student= new Student();
    @Override
    public Student getModel() {
        return student;
    }

    private LoginService loginService;

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public String stulogin(){
        System.out.println("stulogin");
//        Student login = loginService.login(student);
//
//        if (login!=null){
//            System.out.println("登陆成功");
//            return SUCCESS;
//        }else{
//            System.out.println("登陆失败");
//            return ERROR;
//        }
        return "stulogin";
    }


}
