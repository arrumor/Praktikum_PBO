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

    public String getEmail(){
        return email;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString(){
        return "Email: " + email + ", Username: " + username + ", Password: " + password;
    }
}