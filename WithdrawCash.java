import java.util.*;

public class WithdrawCash extends CashWithdrawl {

    Scanner sc = new Scanner(System.in);
    HomeScreen hs;
    float amount;
    String dummyPin;

    public void withdrawCash(){
        System.out.println("Please enter your PIN to proceed:");
        dummyPin = sc.nextLine();

        if(dummyPin.equals(BalanceEnquiry.PIN)){
            System.out.println("Please enter the amount you would like to withdraw:");
            amount = sc.nextFloat();

            while(amount % 100 == 0 && amount <= 20000){
                BalanceEnquiry.balance -= amount;
                break;
            }

                System.out.println("Would you like to view your balance?");
                String response = sc.nextLine();

                if(response.equalsIgnoreCase("Y")){
                    System.out.println("Account Balance: " + BalanceEnquiry.balance);

                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException e){
                        System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
                    }

                    hs.home_page_display();
                }
                else{
                    System.out.println("Thank you for using Axis Bank Services! Please wait....");

                    try{
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException e){
                        System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
                    }

                    hs.home_page_display();
                }
            }    
            else{
                System.out.println("Wrong PIN entered! Please try again.");

                try{
                    Thread.sleep(3000);
                }
                catch(InterruptedException e){
                    System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
                }

                hs.home_page_display();
            }
        }
    }
