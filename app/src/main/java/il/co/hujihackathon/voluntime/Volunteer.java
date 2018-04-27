package il.co.hujihackathon.voluntime;

/**
 * Created by noama2004 on 4/26/18.
 */

public class Volunteer {
    public String name, mail, password;

    public Volunteer(String mail, String password, String name){
        this.name = name;
        this.password = password;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String login() {
        return mail.substring(0, mail.indexOf("@"));
    }

    public String getPassword() {
        return password;
    }

}
