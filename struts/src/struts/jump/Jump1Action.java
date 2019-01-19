package struts.jump;

import com.opensymphony.xwork2.ActionSupport;

public class Jump1Action extends ActionSupport {

    public String execute() throws Exception {
        System.out.println("Jump1");
        return SUCCESS;
    }
}
