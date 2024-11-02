import java.util.*;

public class ChangePin extends PIN_Change{

    Scanner sc = new Scanner(System.in);
    BalanceEnquiry be;
    HomeScreen hs;
    String newPIN, dummyPin;

    public void ChangePIN(){
        System.out.println("Please enter your current PIN:");
        dummyPin = sc.nextLine();

        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
        }

        if(dummyPin.equals(be.PIN)){
            System.out.println("Please enter your new PIN to proceed:");
            newPIN = sc.nextLine();
            be.PIN = newPIN;
            System.out.println("Please re-enter your new PIN to confirm:");
            String dummyPin2 = sc.nextLine();
            if(dummyPin2.equals(be.PIN)){
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
    }
}
