package model;

public class Admin{
    protected String email;
    protected String username;
    protected String password;

    public Admin(String email, String username, String password){
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String get_email(){
        return email;
    }
    public String get_username(){
        return username;
    }
    public String get_password(){
        return password;
    }

    public void set_email(String email){
        this.email = email;
    }
    public void set_username(String username){
        this.username = username;
    }
    public void set_password(String password){
        this.password = password;
    }

    public String dalam_string(){
        return "Email: " + email + ", Username: " + username + ", Password: " + password;
    }
}