public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number){

        // Return -1 if number is negative, which is not allowed
        if(number < 0){
            return -1;
        }

        // Declare a sum variable
        int sum = 0;

        // Make a copy of the original input number and store
        // in the firstDigit variable
        int firstDigit = number;

        // Extract the first digit
        int lastDigit = number % 10;

        // Use a loop to extract the first digit
        // Continue dividing by 10 until the first digit is reached
        while(firstDigit >= 10) {
            firstDigit /= 10;
        }

        // Calculate the sum of the first and last digit
        sum = firstDigit + lastDigit;

        // Return the sum
        return sum;
    }
}
