public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        // Initialize a variable to store the reversed number
        // Store the original number in a variable for manipulation
        int reversedNum = 0;
        int numCopy = number;

        // Check for negative number, and turn to positive if needed
        boolean isNegative = number < 0;
        if(isNegative){
            numCopy = -numCopy;
        }

        // Loop over the input number to build the reverse number
        while(numCopy != 0){
            int digit = numCopy % 10; // Obtain last digit
            reversedNum = reversedNum * 10 + digit; // Add last digit to reversed number
            numCopy = numCopy / 10; // remove the used digit from the input number
        }

        // Make reversed number negative if the input number was negative
        if(isNegative){
            reversedNum = -reversedNum;
        }

        // Check if reversed number is equal to the input number.
        // If so, return true, otherwise return false.
        return number == reversedNum;
    }
}
