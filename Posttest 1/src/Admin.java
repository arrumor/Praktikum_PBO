public class Admin{
    private int id_admin;
    private String email;
    private String username;
    private String password;

    public Admin(int id_admin, String email, String username, String password){
        this.id_admin = id_admin;
        this.email = email;
        this.username = username;
        this.password = password;
    }


    public int getId_admin(){
        return id_admin;
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
        return "ID Admin: " + id_admin + ", Email: " + email + ", Username: " + username + ", Password: " + password;
    }
}