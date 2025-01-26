import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class AtmMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HomeScreen hs = new HomeScreen();
        BalanceEnquiry balanceEnquiry = new CheckBalance();
        CashWithdrawl cashWithdrawl = new WithdrawCash();
        PIN_Change pinChange = new ChangePin();
        UtilityBillPayment utilityBillPayment = new PayBills();
        mobilePhoneUpdate phoneUpdate = new updatePhoneNumber();

        System.out.println("Welcome to HFDC Bank!");
        System.out.println("Please select an option below to begin:");
        System.out.println("1.Balance Enquiry       2.Cash Withdrawl");
        System.out.println("3.PIN Change            4.Ultra Fast Cash");
        System.out.println("5.Utility Bill Payment  6.Update Mobile Phone Number");

        try {
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    balanceEnquiry.balance_enquiry();
                    break;
                case 2:
                    cashWithdrawl.withdrawCash();
                    break;
                case 3:
                    pinChange.ChangePIN();
                    break;
                case 4:
                    cashWithdrawl = new UltraFastCash();
                    cashWithdrawl.withdrawCash();
                    break;
                case 5:
                    ((PayBills) utilityBillPayment).selectBillToPay();
                    break;
                case 6:
                    phoneUpdate.updateNumber();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    hs.home_page_display();
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        } catch (NoSuchElementException e) {
            System.out.println("No input provided. Please enter a number.");
        } finally {
            scanner.close();
        }
    }
}
