package struts.helloworld;

public class HelloWorld {
    public String HelloAction(){
        System.out.println("Hello World !");
        //返回一个字符串 在struts.xml result使用
        return "success";
    }
}
