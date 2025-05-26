public class Singleton {
    // Private static variable that holds the single instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        System.out.println("From Constructor: Instance created");
        // Initialization code here (if needed)
    }

    // Public static method that returns the single instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            // Create the instance if it doesn't exist yet
            System.out.println("From getInstance: No Instance Exixsts now! Will be created");
            instance = new Singleton();
        }
          System.out.println("From getInstance: Instance Exists Returns it");
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
        Singleton sing2=Singleton.getInstance();

        // Use the instance
        //singletonInstance.showMessage();
    }
}
