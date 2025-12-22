public class NullPointerDemo {

    //Generates NullPointerException (no handling)
    public static void generateException() {
        String text = null;     // text is null
        System.out.println("Calling method on null reference...");
        System.out.println(text.length());  // This line throws NullPointerException
    }

    //Handles NullPointerException using try-catch
    public static void handleException() {
        String text = null; // still null

        try {
            System.out.println("Trying to find length of null reference...");
            System.out.println(text.length());  // risky statement
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught!");
            System.out.println("Reason: You tried to access a method using a null reference.");
        }
    }
    public static void main(String[] args) {

        // First call - generates runtime exception (no handling)
        System.out.println("=== Generating NullPointerException ===");
        try {
            generateException();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        // Now call safe method with handling
        System.out.println("\n=== Handling NullPointerException Safely ===");
        handleException();
    }
}
