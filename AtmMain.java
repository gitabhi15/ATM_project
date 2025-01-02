import java.util.*;

public class AtmMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HomeScreen hs = new HomeScreen();
        BalanceEnquiry balanceEnquiry = new CheckBalance();
        CashWithdrawl cashWithdrawl = new WithdrawCash();
        PIN_Change pinChange = new ChangePin();
        UtilityBillPayment utilityBillPayment = new PayBills();
        mobilePhoneUpdate phoneUpdate = new updatePhoneNumber();

        hs.home_page_display();
        int option = sc.nextInt();

        switch (option) {
            case 1:
                balanceEnquiry.balance_enquiry();
                break;
            case 2:
                cashWithdrawl.withdrawCash();
                break;
            case 3:
                // Implement Mobile Recharge functionality
                break;
            case 4:
                // Implement Open Fixed Deposit functionality
                break;
            case 5:
                pinChange.ChangePIN();
                break;
            case 6:
                cashWithdrawl = new UltraFastCash();
                cashWithdrawl.withdrawCash();
                break;
            case 7:
                ((PayBills) utilityBillPayment).selectBillToPay();
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                hs.home_page_display();
                break;
        }
    }
}
