package web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class servlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init running...");//只执行一次
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("servlet 执行......");//每次用每次执行  刷新也执行
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy running...");//只在关闭Tomcat执行
    }
}
