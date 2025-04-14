package model;

public class Admin extends User{
    public Admin(String email, String username, String password) {
        super(email, username, password);
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String toString() {
        return "Admin: " + username + ", email= " + email;
    }
}