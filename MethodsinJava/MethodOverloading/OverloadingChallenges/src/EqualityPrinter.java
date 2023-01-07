public class EqualityPrinter {

    public static void printEqual(int a, int b, int c) {

        // Validate all numbers are greater than zero
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else {
            if (a == b && a == c && b == c) { // Check if all are the same
                System.out.println("All numbers are equal");
            } else if (a != b && a != c && b != c) { // Check if none are the same
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different"); // None are the same
            }
        }

    }

}
