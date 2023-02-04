public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        // Initialize variables
        int sum = 0;
        int nextNum = 0;

        // Check if number is positive
        if (number < 0) return -1;

        // Loop until numer reduced to zero
        while (number > 0) {

            // Get last digit using modulus
            nextNum = number % 10;

            // Check if that number is even
            // If so add to sum
            if (nextNum % 2 == 0) {
                sum += nextNum;
            }

            // Reduce the remaining number by a tenths place
            number = number / 10;
        }

        // Return the sum
        return sum;
    }
}
