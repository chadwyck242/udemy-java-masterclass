public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        // initialize return value
        boolean isPerfect = false;

        // Initialize a summation variable
        int sum = 0;

        // Check that the numbers are greater than zero
        if (number < 1) {
            return false;
        }

        // Sum up the perfect divisors with a loop,
        // not including the number itself
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum is the same as the original number
        if (sum == number) {
            isPerfect = true;
        }

        return isPerfect;
    }

}
