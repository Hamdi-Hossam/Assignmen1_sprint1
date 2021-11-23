import java.util.Objects;

public class Customer extends user implements observer {
    Ride r = new Ride();

    public void setUsername(String username) {
        this.userName = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getUsername() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getMob() {
        return mobileNum;
    }

    public void login(userManager user,String userName, String password) {
        if (Objects.equals(user.customerRegister.get("Username"), userName) && Objects.equals(user.customerRegister.get("Password"), password))  {
            System.out.println("login succeeded");
        } else {
            System.out.println("login failed");
        }
    }

    @Override
    public void update(int offer) {
        System.out.println("My offer is "+ offer);
    }
}


