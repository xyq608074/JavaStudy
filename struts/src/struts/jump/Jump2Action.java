package struts.jump;

import com.opensymphony.xwork2.ActionSupport;

public class Jump2Action extends ActionSupport {
    public String execute() throws Exception {
        System.out.println("Jump2");
        return SUCCESS;
    }
}
