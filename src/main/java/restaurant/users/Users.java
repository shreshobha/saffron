package restaurant.users;


// import jakarta.validation.constraints.NotNull; // Uncomment if you want to use validation

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    private String username;
    private String password;
    private String user_role;
    private String email;
    private String phone_number;
    private String address;

    public Users() {}

    public Users(String username, String password, String user_role, String email, String phone_number, String address) {
        this.username = username;
        this.password = password;
        this.user_role = user_role;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
    }
    public int getUser_id() { return user_id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getUser_role() { return user_role; }
    public String getEmail() { return email; }
    public String getPhone_number() { return phone_number; }
    public String getAddress() { return address; }
    public void setUser_id(int user_id) { this.user_id = user_id; }
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setUser_role(String user_role) { this.user_role = user_role; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone_number(String phone_number) { this.phone_number = phone_number; }
    public void setAddress(String address) { this.address = address; }




}
