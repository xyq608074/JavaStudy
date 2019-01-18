package web.loginservlet;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import web.loginservlet.domain.User;
import web.utils.C3P0Utils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "/login")
public class loginservlet extends HttpServlet {


    @Override
    public void init() throws ServletException {
        int count=0;
        this.getServletContext().setAttribute("count",count);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        //获得用户名和密码
        String adminname = request.getParameter("adminname");
        String adminpwd = request.getParameter("adminpwd");

        QueryRunner qr=new QueryRunner(C3P0Utils.getDataSource());
        String sql="select * from admin where adminname=? and adminpwd=?";
        User user=null;
        //数据库对比
        try {
            user = qr.query(sql, new BeanHandler<User>(User.class),adminname,adminpwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        if (user!=null){
            Integer count = (Integer) this.getServletContext().getAttribute("count");
            count++;
            response.getWriter().write("登陆成功... 您是第"+count+"个登陆的用户...");
            this.getServletContext().setAttribute("count",count);
            response.getWriter().write(user.toString());
        }else{
            response.getWriter().write("登陆失败");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
