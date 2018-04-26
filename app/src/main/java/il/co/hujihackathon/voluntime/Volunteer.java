package il.co.hujihackathon.voluntime;

/**
 * Created by noama2004 on 4/26/18.
 */

public class Volunteer {
    public String name, mail, password;
    public int age;

    public Volunteer(String mail, String password, String name, int age){
        this.name = name;
        this.age = age;
        this.password = password;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
