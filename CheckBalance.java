import java.util.*;

public class CheckBalance extends BalanceEnquiry{
    
    Scanner sc = new Scanner(System.in);
    String dummyPin, response;
    HomeScreen hs;

    public CheckBalance(){
        super();
    }

    public void balance_enquiry(){
        System.out.println("Please enter your PIN:");
        dummyPin = sc.nextLine();

        if(dummyPin.equals(BalanceEnquiry.PIN)){
            System.out.println("Your account balance is:");
            System.out.println("\t\t" + BalanceEnquiry.balance);

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
            }

            System.out.println("Would you like to print a receipt?");
            response = sc.nextLine();
            
            if(response == "Yes"){
                System.out.println("Account Balance: " + BalanceEnquiry.balance);
            }
            else{
                System.out.println("Thank you for your patience!");
                
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){
                    System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
                }

                hs.home_page_display();
            }
        }
        else{
            System.out.println("Oops! Something went wrong. Please try again later!");
            hs.home_page_display();
        }
    }
}
