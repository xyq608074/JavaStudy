package struts.valuestack;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import struts.form.domain.User;

public class ValueStack extends ActionSupport {
    @Override
    public String execute() throws Exception {

        //pust 里面放入的是对象
        User user=new User("张三",18,null,null);
        ActionContext.getContext().getValueStack().push(user);

        //set 里面有两个值 第一个值放入的是key  第二个是一个对象
        //一般情况下在debug里面是看不到的 只有写入get  set  方法才可以看到
        ActionContext.getContext().getValueStack().set("names","李四");

        return super.execute();
    }
}
