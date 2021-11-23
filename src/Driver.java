import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Driver extends user implements subject{
    String nationalID;
    String license;
    String[] favArea;
    //    int Balance;
    private List<observer> listOfObservers = new ArrayList<observer>();
    offer o = new offer();
    public void setPrice(int price){
        o.price = price;
        notifyObserver();
    }
    public int getPrice(){
        return o.price;
    }
    //    setters
    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public void setLicense(String license) {
        this.license = license;
    }

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

    //    getters
    public String getNationalID() {
        return nationalID;
    }

    public String getLicense() {
        return license;
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

    public void notifyDriver(String source){
        boolean check = Arrays.asList(favArea).contains(source);
        if(check){
            System.out.println("there is someone requested a ride in the "+source + " area and you added this area in your favourite areas");
        }
    }
    public void login(userManager user,String userName, String password) {
        if (user.DriverRegister.get("verify")== "True"){
            if (Objects.equals(user.DriverRegister.get("Username"), userName) && Objects.equals(user.DriverRegister.get("Password"), password))  {
                System.out.println("login succeeded");
            } else {
                System.out.println("login failed");
            }
        }
        else {System.out.println("you should wait until the admin accept your request");}
    }
    public String[] getFavArea() {
        return favArea;
    }

    public void addFavArea(String[] favArea) {
        this.favArea = favArea;
    }

    @Override
    public void registerObserver(observer observer) {
        listOfObservers.add(observer);
    }

    @Override
    public void removeObserver(observer observer) {
        listOfObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (observer observer: listOfObservers)
        {
            observer.update(getPrice());
        }
    }
}