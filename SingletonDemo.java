public class Singleton {
    // Private static variable that holds the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // Initialization code here (if needed)
    }

    // Public static method that returns the single instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            // Create the instance if it doesn't exist yet
            instance = new Singleton();
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }

    // Main method to test the singleton behavior
    public static void main(String[] args) {
        // Get the only instance of Singleton
        Singleton singletonInstance = Singleton.getInstance();

        // Use the instance
        singletonInstance.showMessage();
    }
}
