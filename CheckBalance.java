import java.util.Scanner;

public class CheckBalance{
    Scanner sc = new Scanner(System.in);
    HomeScreen hs = new HomeScreen(); // Initialize HomeScreen instance
    String dummyPin;

    public void balance_enquiry() {
        System.out.println("Please enter your PIN to proceed:");
        dummyPin = sc.nextLine().trim();

        if (dummyPin.equals(BankDetails.PIN)) {
            System.out.println("Account Balance: " + BankDetails.balance);
            System.out.println("Would you like to print the receipt? (Yes/No)");
            String response = sc.nextLine();

            if (response.equalsIgnoreCase("Yes")) { // Corrected string comparison
                System.out.println("Printing receipt...");
            } else {
                System.out.println("Thank you for using Axis Bank Services!");
            }

            hs.home_page_display(); // Return to home page after completing the balance enquiry
        } else {
            System.out.println("Invalid PIN. Please try again.");
            hs.home_page_display(); // Return to home page on invalid PIN
        }
    }
}
