import java.util.*;

public class PayBills extends UtilityBillPayment{

    Scanner sc = new Scanner(System.in);
    String dummyPin, response;
    int option;
    HomeScreen hs;
    float waterBill, mobileBill, electricityBill, creditCardBill; 

    public void selectBillToPay() {
        System.out.println("Please select which bill you would like to pay:");

        switch(option){
            case 1 : System.out.println("Please enter the bill amount:"); waterBill = sc.nextFloat(); payWaterBill(waterBill); break;
            case 2 : System.out.println("Please enter the bill amount:"); mobileBill = sc.nextFloat(); payMobileBill(mobileBill); break;
            case 3 : System.out.println("Please enter the bill amount:"); electricityBill = sc.nextFloat(); payElectricityBill(electricityBill); break;
            case 4 : System.out.println("Please enter the bill amount:"); creditCardBill = sc.nextFloat(); payCreditCardBill(creditCardBill); break;
            default: System.out.println("Invalid option. Please try again."); hs.home_page_display(); break;
        }
    }

    public float payWaterBill(float waterBill){
        System.out.println("Please enter your PIN:");
        dummyPin = sc.nextLine();
        if(dummyPin.equals(BalanceEnquiry.PIN)){
            System.out.println("Please wait while we process your payment...");

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
            }

            System.out.println("Your water bill of " + waterBill + " has been successfully paid!");
            BalanceEnquiry.balance -= waterBill;
            return BalanceEnquiry.balance;
        }
        else{
            System.out.println("Oops! Something went wrong. Please try again later!");
            hs.home_page_display();
        }
        return 0;
    }
    public float payMobileBill(float mobileBill){
        System.out.println("Please enter your PIN:");
        dummyPin = sc.nextLine();  
        if(dummyPin.equals(BalanceEnquiry.PIN)){
            System.out.println("Please wait while we process your payment...");

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
            }

            System.out.println("Your mobile bill of " + mobileBill + " has been successfully paid!");
            BalanceEnquiry.balance -= mobileBill;
            return BalanceEnquiry.balance;
        }
        else{
            System.out.println("Oops! Something went wrong. Please try again later!");
            hs.home_page_display();
        }
        return 0;
    }

    public float payElectricityBill(float electricityBill){
        System.out.println("Please enter your PIN:");
        dummyPin = sc.nextLine();
        if(dummyPin.equals(BalanceEnquiry.PIN)){
            System.out.println("Please wait while we process your payment...");

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
            }

            System.out.println("Your electricity bill of " + electricityBill + " has been successfully paid!");
            BalanceEnquiry.balance -= electricityBill;
            return BalanceEnquiry.balance;
        }
        else{
            System.out.println("Oops! Something went wrong. Please try again later!");
            hs.home_page_display();
        }
        return 0;
    }

    public float payCreditCardBill(float creditCardBill){
        System.out.println("Please enter your PIN:");
        dummyPin = sc.nextLine();
        if(dummyPin.equals(BalanceEnquiry.PIN)){
            System.out.println("Please wait while we process your payment...");

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
            }

            System.out.println("Your credit card bill of " + creditCardBill + " has been successfully paid!");
            BalanceEnquiry.balance -= creditCardBill;
            return BalanceEnquiry.balance;
        }
        else{
            System.out.println("Oops! Something went wrong. Please try again later!");
            hs.home_page_display();
        }
        return 0;
    }   
}
