import java.util.*;

public class main {
    public static void main (String[]args){
        //   make an object from the classes   //
        Driver d = new Driver();
        Customer c =new Customer();
        Ride r =new Ride();
        userManager um = new userManager();
        admin a =new admin();
        Scanner sc = new Scanner(System.in);
        //   Driver inputs to register   //
        System.out.println("******************** Driver registration ********************");
        System.out.println("Enter username: ");
        d.setUsername(sc.next());
        System.out.println("Enter password: ");
        d.setPassword(sc.next());
        System.out.println("Enter email: ");
        d.setEmail(sc.next());
        System.out.println("Enter mobile number: ");
        d.setMobileNum(sc.next());
        System.out.println("Enter license num: ");
        d.setLicense(sc.next());
        System.out.println("Enter nationalID: ");
        d.setNationalID(sc.next());
        um.DriverRegister(d);
        //   Admin verify the request   //
        a.verifyRegistration(um);
        //   Driver inputs to log in  //
        System.out.println("******************** Driver log in ********************");
        System.out.println("Enter username: ");
        String UserForDriver = sc.next();
        System.out.println("Enter password: ");
        String PassForDriver = sc.next();
        d.login(um,UserForDriver,PassForDriver);
        //   driver inputs to add favourite area   //
        System.out.print("Enter the number of favourite areas you want to store: ");
        int numOfFavArea =sc.nextInt();
        String[] faveArea = new String[numOfFavArea+1];
        System.out.println("Enter the Favourite areas: ");
        for (int i = 0; i < numOfFavArea+1; i++) {
            faveArea[i] = sc.nextLine();
        }
        d.addFavArea(faveArea);
        //   print the favourite areas    //
//        String[] faveArea1 =d.getFavArea();
//        for (int i = 0; i <faveArea1.length; ++i) {
//            System.out.println(faveArea1[i]);
//        }
        //   customer inputs to register   //
        System.out.println("******************** customer registration ********************");
        System.out.println("Enter username: ");
        c.setUsername(sc.next());
        System.out.println("Enter password: ");
        c.setPassword(sc.next());
        System.out.println("Enter email: ");
        c.setEmail(sc.next());
        System.out.println("Enter mobile number: ");
        c.setMobileNum(sc.next());
        um.UserRegister(c);
        //   customer inputs to log in  //
        System.out.println("******************** customer log in ********************");
        System.out.println("Enter username: ");
        String UserForCustomer = sc.next();
        System.out.println("Enter password: ");
        String PassForCustomer = sc.next();
        c.login(um,UserForCustomer,PassForCustomer);
        //   customer inputs to request a ride  //
        System.out.println("Enter source area to request a ride: ");
        String SourceArea = sc.next();
        System.out.println("Enter destination to request a ride: ");
        String Destination = sc.next();
        c.r.rm.reqRide(r,SourceArea,Destination);
        d.notifyDriver(SourceArea);
        d.registerObserver(c);
        System.out.println("Enter the offer:");
        int offer = sc.nextInt();
        d.setPrice(offer);
    }
}
