package web.byteimg;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

@WebServlet(name = "byte",urlPatterns = "/byte")
public class ServletByImg extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //使用response获得字节流
        ServletOutputStream out = response.getOutputStream();

        //获得服务器上的图片
        String path = this.getServletContext().getRealPath("jpg.jpg");
        InputStream in = new FileInputStream(path);


        //通过字节客户端获得图片
        int len=0;
        byte[] buffer =new byte[1024];

        while ((len=in.read(buffer))>0){
            System.out.println(len);
            out.write(buffer,0,len);
        }

        in.close();
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
