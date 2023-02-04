public class SumOddRange {

    // Method checks if number is odd and returns true, false otherwise
    public static boolean isOdd(int number) {

        // Check if number is greater than 0
        if (number < 0) {
            return false;
        }

        // Check number is odd and return true
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    // Sum odd numbers within a given range, and return the sum
    public static int sumOdd(int start, int end) {

        // Initialize the sum variable
        int sum = 0;

        // Check if start and end are within required constraints
        if (end < start) {
            return -1;
        }
        else if (start <= 0) {
            return -1;
        }

        // Sum the odd numbers within the given range
        for(int i = start; i <= end; i++) {

            if (isOdd(i)) {
                sum += i;
            }
        }

        // Return the sum of off numbers
        return sum;

    }

}
