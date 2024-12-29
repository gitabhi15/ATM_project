import java.util.*;

public class PayBills extends UtilityBillPayment{

    Scanner sc = new Scanner(System.in);
    String dummyPin, response;
    int option;
    HomeScreen hs;

    public void selectBillToPay() {
        System.out.println("Please select which bill you would like to pay:");

        switch(option){
            case 1 : payWaterBill(); break;
            case 2: payMobileBill(); break;
            case 3: payElectricityBill(); break;
            case 4: payCreditCardBill(); break;
            default: System.out.println("Invalid option. Please try again."); hs.home_page_display(); break;
        }
    }

    public float payWaterBill(){

    }

    public float payMobileBill(){

    }

    public float payElectricityBill(){

    }

    public float payCreditCardBill(){

    }   
}

