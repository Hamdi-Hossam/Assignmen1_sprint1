import java.util.HashMap;

public class userManager {
    HashMap<String, String> DriverRegister = new HashMap<>();
    HashMap<String, String> customerRegister = new HashMap<>();
    public void UserRegister(Customer c) {
        customerRegister.put("Username",c.getUsername());
        customerRegister.put("Password",c.getPassword());
        customerRegister.put("Email",c.getEmail());
        customerRegister.put("Mobile Number",c.getMob());
    }
    public void DriverRegister(Driver D) {
        {
            DriverRegister.put("Username", D.getUsername());
            DriverRegister.put("Password", D.getPassword());
            DriverRegister.put("Email", D.getEmail());
            DriverRegister.put("Mobile Number", D.getMob());
            DriverRegister.put("License", D.getLicense());
            DriverRegister.put("National ID", D.getNationalID());
            DriverRegister.put("verify", "false");
        }
    }
}
