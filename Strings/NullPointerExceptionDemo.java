package Strings;

public class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    // Method to handle NullPointerException using try-catch
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call method to generate the exception
        generateException();

        // Call method to handle the exception using try-catch
        handleException();
    }
}