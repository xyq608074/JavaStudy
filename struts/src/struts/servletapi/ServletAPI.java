package struts.servletapi;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class ServletAPI extends ActionSupport {

    public String execute() throws Exception {

        //request域
        ActionContext.getContext().put("name","requestScope");

        //获得session域
        Map<String, Object> session = ActionContext.getContext().getSession();
        session.put("name","sessionScope");

        //获得application域
        Map<String, Object> application = ActionContext.getContext().getApplication();
        application.put("name","applicationScope");


        return SUCCESS;
    }
}
