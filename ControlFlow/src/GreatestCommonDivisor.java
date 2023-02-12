public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {

        // Initialize variable to find the largest of
        // the two numbers
        int largest;

        // Variables to store the divisors
        int firstDenom = 0;
        int secondDenom = 0;
        int greatestCD = 0;

        // first and second parameters must be greater than 10
        if (first < 10 || second < 10) {
            return -1;
        }

        // Check which of the two parameters is the larger
        if (first > second) {
            largest = first;
        } else {
            largest = second;
        }

        // Loop over the paramters finding common divisors
        for (int i = 1; i <= largest; i++) {
            if (first % i == 0 && second % i == 0) {
                greatestCD = i;
            }
        }

        // Return the greatest common divisor
        return greatestCD;

    }
}
