import java.util.*;

public class PayBills extends UtilityBillPayment{

    Scanner sc = new Scanner(System.in);
    String dummyPin, response, realPin = BankDetails.PIN;
    int option;
    HomeScreen hs = new HomeScreen();
    float waterBill, mobileBill, electricityBill, creditCardBill; 

    public void selectBillToPay() {
        System.out.println("1. Water Bill");
        System.out.println("2. Mobile Bill");
        System.out.println("3. Electricity Bill");
        System.out.println("4. Credit Card Bill");
        System.out.println("Please select which bill you would like to pay:");
        option = sc.nextInt();
        sc.nextLine();

        switch(option){

            case 1 : 
                System.out.println("Please enter the bill amount:"); 
                waterBill = sc.nextFloat();
                sc.nextLine(); 
                payWaterBill(waterBill); 
                break;

            case 2 : 
                System.out.println("Please enter the bill amount:"); 
                mobileBill = sc.nextFloat(); 
                sc.nextLine();
                payMobileBill(mobileBill); 
                break;

            case 3 :
                System.out.println("Please enter the bill amount:");
                electricityBill = sc.nextFloat(); 
                sc.nextLine();
                payElectricityBill(electricityBill); 
                break;

            case 4 : 
                System.out.println("Please enter the bill amount:"); 
                creditCardBill = sc.nextFloat(); 
                sc.nextLine();
                payCreditCardBill(creditCardBill); 
                break;

            default: 
                System.out.println("Invalid option. Please try again."); 
                hs.home_page_display(); 
                break;
        }
    }

    public float payWaterBill(float waterBill){
        System.out.println("Please enter your PIN:");
        dummyPin = sc.nextLine();
        //sc.nextLine();
        if(dummyPin.equals(realPin)){
            System.out.println("Please wait while we process your payment...");

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
            }

            System.out.println("Your water bill of " + waterBill + " has been successfully paid!");
            BankDetails.balance -= waterBill;
            hs.home_page_display();
            return BankDetails.balance;
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
        if(dummyPin.equals(realPin)){
            System.out.println("Please wait while we process your payment...");

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
            }

            System.out.println("Your mobile bill of " + mobileBill + " has been successfully paid!");
            BankDetails.balance -= mobileBill;
            return BankDetails.balance;
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
        if(dummyPin.equals(realPin)){
            System.out.println("Please wait while we process your payment...");

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
            }

            System.out.println("Your electricity bill of " + electricityBill + " has been successfully paid!");
            BankDetails.balance -= electricityBill;
            return BankDetails.balance;
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
        if(dummyPin.equals(realPin)){
            System.out.println("Please wait while we process your payment...");

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException e){
                System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
            }

            System.out.println("Your credit card bill of " + creditCardBill + " has been successfully paid!");
            BankDetails.balance -= creditCardBill;
            return BankDetails.balance;
        }
        else{
            System.out.println("Oops! Something went wrong. Please try again later!");
            hs.home_page_display();
        }
        return 0;
    }   
}
