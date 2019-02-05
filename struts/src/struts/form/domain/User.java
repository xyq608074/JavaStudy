package struts.form.domain;

import java.util.Date;
import java.util.List;

public class User {
    private String name;
    private Integer age;
    private Date birthday;
    private List hobby;

    public User() {
    }

    public User(String name, Integer age, Date birthday, List hobby) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List getHobby() {
        return hobby;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", hobby=" + hobby +
                '}';
    }
}
