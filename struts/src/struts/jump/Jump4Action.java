package struts.jump;

import com.opensymphony.xwork2.ActionSupport;

public class Jump4Action extends ActionSupport {

    public String execute() throws Exception {
        System.out.println("Jump4");
        return SUCCESS;
    }
}
