package struts.jump;

import com.opensymphony.xwork2.ActionSupport;

public class Jump3Action extends ActionSupport {

    public String execute() throws Exception {
        System.out.println("Jump3");
        return SUCCESS;
    }
}
