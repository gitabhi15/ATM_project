public class AtmMain {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("\n\t\tWelcome to the Axis Bank ATM System!\n");

        // Initialize and display the home screen
        HomeScreen hs = new HomeScreen();
        hs.home_page_display(); // Start the ATM by displaying the home page

        // The rest of the flow control will be handled by the HomeScreen class.
    }
}
