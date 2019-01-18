package web.servletdown;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@WebServlet(name = "down",urlPatterns = "/down")
public class ServletDown extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //通过获取浏览器get的形式获取文件名
        String filename=request.getParameter("filename");

        //要下载这个文件的类型
        response.setContentType(this.getServletContext().getMimeType(filename));
        //告诉客户端浏览器 我的功能是下载 不是解析
        response.setHeader("Content-Disposition","attachment;filename="+filename);


        //获得文件跟目录
        String path = this.getServletContext().getRealPath(filename);
        //输入流 获得文件
        InputStream in =new FileInputStream(path);
        //输出流 输出文件
        ServletOutputStream out = response.getOutputStream();

        int len=0;
        byte[] buffer = new byte[1024];

        while ((len=in.read(buffer))>0){
            out.write(buffer,0,len);
        }

        in.close();
        out.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
