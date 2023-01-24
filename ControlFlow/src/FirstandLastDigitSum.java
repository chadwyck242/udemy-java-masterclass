public class FirstandLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        // Initialize variables
        int sum;
        int lastDigit = number % 10; //Already know this
        int firstDigit;
        double placeCounter = -1; // Start at -1 since we need first place preserved
        int numCopy = number; // A copy to modify in the while loop

        // If number is less than zero, just return -1
        if(numCopy < 0) {
            return -1;
        }

        // Use a loop to count the place digits in the number
        while(numCopy > 0) {
            numCopy = numCopy / 10;
            placeCounter += 1;
        }

        // Get the divisor to the correct power of 10
        double placeDivisor = Math.pow(10.0, placeCounter);

        // Extract the first digit by division
        firstDigit =  number / (int) placeDivisor;

        // Sum the first and last digits together
        sum = firstDigit + lastDigit;

        return sum;
    }
}
