import java.util.Scanner;

public class WithdrawCash extends CashWithdrawl {
    Scanner sc = new Scanner(System.in);
    HomeScreen hs = new HomeScreen(); // Initialize HomeScreen instance
    float amount;
    String dummyPin;
    String realPin = BankDetails.PIN; // Corrected variable name

    public void withdrawCash() {
        System.out.println("Please enter your PIN to proceed:");
        dummyPin = sc.nextLine().trim();

        if (dummyPin.equals(realPin)) {
            System.out.println("Please enter the amount you would like to withdraw:");
            amount = sc.nextFloat();
            sc.nextLine();

            if (amount % 100 == 0 && amount <= 20000) {
                BankDetails.balance -= amount;
                System.out.println("Would you like to view your balance? (Y/N)");
                String response = sc.nextLine();

                if (response.equalsIgnoreCase("Y")) { // Corrected string comparison
                    System.out.println("Account Balance: " + BankDetails.balance);

                    try {
                        Thread.sleep(3000); // Simulate delay
                    } catch (InterruptedException e) {
                        System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
                    }

                    hs.home_page_display(); // Return to home page
                } else {
                    System.out.println("Thank you for using Axis Bank Services! Please wait....");

                    try {
                        Thread.sleep(3000); // Simulate delay
                    } catch (InterruptedException e) {
                        System.err.println("Oops! Something went wrong. Please try again later!" + e.getMessage());
                    }

                    hs.home_page_display(); // Return to home page
                }
            } else {
                System.out.println("Invalid amount. Please ensure the amount is a multiple of 100 and less than or equal to ₹20,000.");
                hs.home_page_display(); // Return to home page after an invalid amount
            }
        } else {
            System.out.println("Invalid PIN. Please try again.");
            hs.home_page_display(); // Return to home page on invalid PIN
        }
    }
}
