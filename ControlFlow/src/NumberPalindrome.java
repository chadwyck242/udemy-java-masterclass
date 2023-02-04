public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

        // Variable declarations
        int reverseNumber = 0;
        int numCopy = number; // Make a local copy of the parameter number
        int lastDigit;
        int signSwitch = 1; // Switch the signs of the numbers as needed

        // Check if copied number is negative, make positive if so
        // Flip the number sign switch
        if(numCopy < 0) {
            numCopy = numCopy * (-1);
            signSwitch = -1;
        }

        while(numCopy > 0) {
            // Extract last digit of number
            lastDigit = numCopy % 10;
            // Increase placeholder of reverse number by 10
            // and add the modulo remainder
            reverseNumber = (reverseNumber * 10) + lastDigit;
            // Remove remaining last digit from the original number
            numCopy = numCopy / 10;
        }

        // Check if the two numbers are equal and return true or false accordingly
        reverseNumber = reverseNumber * signSwitch; // Switch the signs as needed

        return number == reverseNumber;
    }
}
