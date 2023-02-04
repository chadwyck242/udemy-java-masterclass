public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {

        // Initialize variables
        boolean sharedDigit;
        int numL1, numL2, numR1, numR2; // Will store individual digits

        // Check if numbers are within required range
        if (num1 < 10 || num1 > 99) {
            return false;
        }
        else if (num2 < 10 || num2 > 99) {
            return false;
        }

        // Extract the digits from each number
        numL1 = num1 % 10;
        numL2 = num1 / 10;
        numR1 = num2 % 10;
        numR2 = num2 / 10;

        // Check if any of the digits are same as each other
        if (numL1 == numR1 || numL1 == numR2) {
            sharedDigit = true;
        }
        else if (numL2 == numR1 || numL2 == numR2) {
            sharedDigit = true;
        } else {
            sharedDigit = false;
        }

        // Return if shared digits were found
        return sharedDigit;

    }
}
