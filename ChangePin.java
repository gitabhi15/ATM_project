import java.util.*;

public class ChangePin extends PIN_Change{

    Scanner sc = new Scanner(System.in);
    HomeScreen hs = new HomeScreen();
    String newPIN, dummyPin, realPin = BankDetails.PIN;

    public void ChangePIN(){
        System.out.println("Please enter your current PIN:");
        dummyPin = sc.nextLine();

        if(dummyPin.equals(realPin)){
            System.out.println("Please enter your new PIN to proceed:");
            newPIN = sc.nextLine();
            BankDetails.PIN = newPIN;

            System.out.println("Please re-enter your new PIN to confirm:");
            String dummyPin2 = sc.nextLine();
            if(dummyPin2.equals(BankDetails.PIN)){
                System.out.println("Thank you! Your PIN has now been updated.\nPlease wait a few seconds.....");
            }
            else{
                System.out.println("Incorrect PIN entered! Please try again later");
                try{
                    Thread.sleep(3000);
                }
                catch(InterruptedException e){
                    System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
                }
                hs.home_page_display();
            }

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
            }
        }
        else{
            System.out.println("Incorrect PIN entered! Please try again later.");
            hs.home_page_display();
        }
        hs.home_page_display();
    }
}
