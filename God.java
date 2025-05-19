public class God {
    private static God godInstance=null;

    private God() {
        // Private constructor to prevent instantiation
    }

    public static God getInstance() {

        if (godInstance == null) {
            godInstance = new God();
        }
        return godInstance;
    }

    public void displayMessage() {
        System.out.println("Hello from Singleton God!");
    }

    // Main method to test the Singleton pattern
    public static void main(String[] args) {
        God god1 = God.getInstance();
        God god2 = God.getInstance();

        // Both references should point to the same instance
        System.out.println("Are both instances equal? " + (god1 == god2));

        // Call a method on the singleton instance
        god1.displayMessage();
    }
}

