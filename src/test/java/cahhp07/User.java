package cahhp07;

public class User {
    private final String id;
    private final String password;
    private final String email;

    public User(String id, String pw, String mail) {
        this.id = id;
        this.password = pw;
        this.email = mail;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
