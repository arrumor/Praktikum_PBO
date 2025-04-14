package model;

public class Pengguna extends User{
    public static final Pengguna DEFAULT_USER = new Pengguna("user@mail.com", "user", "user123");

    public Pengguna (String email, String username, String password){
        super(email, username, password);
    }

    @Override
    public String toString() {
        return "Pengguna: " + username + ", email: " + email;
    }
}