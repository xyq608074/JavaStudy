package web.session.longSession;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "LongSession",urlPatterns = "/lsession")
public class LongSession extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //创建session
        HttpSession session = request.getSession();

        //创建一个session和JSESSIONID一样名字的sessionid 并且吧sessionid当做值穿进去
        Cookie cookie = new Cookie("JSESSIONID", session.getId());
        //设置路径
        cookie.setPath("/web/");
        //设置时间 10分钟
        cookie.setMaxAge(60*10);

        //发送到cookie
        response.addCookie(cookie);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
