import java.util.*;

public class updatePhoneNumber extends mobilePhoneUpdate{

    Scanner sc = new Scanner(System.in);
    public String phoneNumber = "9034667922";
    HomeScreen hs;
    String dummyPin, dummyNumber;

    public void updateNumber(){
        System.out.println("Please enter your PIN:");
        dummyPin = sc.nextLine();

        if(dummyPin.equals(BalanceEnquiry.PIN)){
            System.out.println("Please enter your new phone number:");
            dummyNumber = sc.nextLine();
            phoneNumber = dummyNumber;
            System.out.println("Phone number updated successfully!");
        }
        else{
            System.out.println("Invalid PIN. Please try again.");
            hs.home_page_display();
        }
    }
}
