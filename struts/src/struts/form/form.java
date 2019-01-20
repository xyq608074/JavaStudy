package struts.form;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import struts.form.domain.User;

/**
 * 处理表单提交
 */
public class form extends ActionSupport implements ModelDriven<User> {

    private User user=new User();

    @Override
    public String execute() throws Exception {
        System.out.println(user);
        return SUCCESS;
    }


    @Override
    public User getModel() {
        return user;
    }
}
