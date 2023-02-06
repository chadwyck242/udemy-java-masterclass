public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        // Validate the three inputs are within range
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        // Initialize right-most number variables
        int right1, right2, right3;

        // Extract the rightmost digits from each number
        right1 = num1 % 10;
        right2 = num2 % 10;
        right3 = num3 % 10;

        // Check if any two are equal
        if ((right1 == right2) || (right1 == right3) || (right2 == right3)) {
            return true;
        } else {
            return false;
        }

    }

    // Define method to validate number ranges
    public static boolean isValid(int num) {
        // Returns true if number within required range
        return (num >= 10) && (num <= 1000);

    }

}
