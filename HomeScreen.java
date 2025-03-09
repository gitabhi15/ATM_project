import java.util.Scanner;

public class HomeScreen {
    Scanner sc = new Scanner(System.in);

    public void home_page_display() {
        System.out.println("\n\t\t\t1. Check Balance");
        System.out.println("\t\t\t2. Withdraw Cash");
        System.out.println("\t\t\t3. PIN Change");
        System.out.println("\t\t\t4. Ultra Fast Cash");
        System.out.println("\t\t\t5. Utility Bill Payment");
        System.out.println("\t\t\t6. Update Mobile Phone Number");
        System.out.println("\t\t\t7. Exit");

        System.out.println("\nPlease select an option:\n");
        int choice = sc.nextInt();
        sc.nextLine();  // Consume newline

        switch (choice) {
            case 1:
                CheckBalance cb = new CheckBalance();
                cb.balance_enquiry();
                break;

            case 2:
                WithdrawCash wc = new WithdrawCash();
                wc.withdrawCash();
                break;

            case 3:
                ChangePin cp = new ChangePin();
                cp.ChangePIN();
                break;

            case 4:
                UltraFastCash ufc = new UltraFastCash();
                ufc.withdrawCash();
                break;

            case 5:
                PayBills pb = new PayBills();
                pb.selectBillToPay();
                break;

            case 6:
                updatePhoneNumber umn = new updatePhoneNumber();
                umn.updateNumber();
                break;
            
            case 7:
                System.out.println("Thank you for using Axis Bank ATM Services. Have a great day!");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid option. Please try again.");
                home_page_display();  // Return to home page on invalid input
        }
    }
}
