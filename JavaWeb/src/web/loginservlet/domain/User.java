package web.loginservlet.domain;

public class User {
    private int id;
    private String adminname;
    private String adminpwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname;
    }

    public String getAdminpwd() {
        return adminpwd;
    }

    public void setAdminpwd(String adminpwd) {
        this.adminpwd = adminpwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", adminname='" + adminname + '\'' +
                ", adminpwd='" + adminpwd + '\'' +
                '}';
    }
}
