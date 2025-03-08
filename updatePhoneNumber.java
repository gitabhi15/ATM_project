import java.util.*;

public class updatePhoneNumber extends mobilePhoneUpdate{

    Scanner sc = new Scanner(System.in);
    HomeScreen hs = new HomeScreen();
    String dummyPin, dummyNumber, realPin = BankDetails.PIN;
    String phoneNo = BankDetails.phoneNumber;

    public void updateNumber(){
        System.out.println("Please enter your PIN:");
        dummyPin = sc.nextLine();

        if(dummyPin.equals(realPin)){
            System.out.println("Enter your current phone number:");
            String currentPhoneNumber = sc.nextLine();
    
            if (currentPhoneNumber.equals(phoneNo)) { // Compare with stored phone number
                System.out.println("Enter your new phone number:");
                String newPhoneNumber = sc.nextLine();
    
                System.out.println("Re-enter your new phone number:");
                String confirmPhoneNumber = sc.nextLine();
    
                if (newPhoneNumber.equals(confirmPhoneNumber)) { // Confirm new phone number
                    BankDetails.phoneNumber = newPhoneNumber;
                    System.out.println("Phone number updated successfully!");
                    hs.home_page_display();
                } else {
                    System.out.println("Phone number confirmation does not match. Please try again.");
                }
            } else {
                System.out.println("Incorrect current phone number. Please try again.");
            }
        }
        else{
            System.out.println("Invalid PIN. Please try again.");
            hs.home_page_display();
        }
    }
}
