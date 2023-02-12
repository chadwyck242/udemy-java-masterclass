public class NumberToWords {

    public static void numberToWords(int number) {

        // Initialize variables
        int reverseNumber;
        int numLength = 0;
        int revLength = 0;

        // Check that the number is positive
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        // Reverse the number
        reverseNumber = reverse(number);

        // Get the lengths of the numbers before and after
        numLength = getDigitCount(number);
        revLength = getDigitCount(reverseNumber);


        // Account for a value of zero
        if (reverseNumber == 0) {
            System.out.println("Zero");
        }
        // Start printing out digits to words based on the reversed numbers
        int nextNumber; // Variable to store extracted last digit
        while (reverseNumber > 0) {
            nextNumber = reverseNumber % 10;
            reverseNumber = reverseNumber / 10;

            if (nextNumber == 0) {
                System.out.println("Zero");
            }
            else if (nextNumber == 1) {
                System.out.println("One");
            }
            else if (nextNumber == 2) {
                System.out.println("Two");
            }
            else if (nextNumber == 3) {
                System.out.println("Three");
            }
            else if (nextNumber == 4) {
                System.out.println("Four");
            }
            else if (nextNumber == 5) {
                System.out.println("Five");
            }
            else if (nextNumber == 6) {
                System.out.println("Six");
            }
            else if (nextNumber == 7) {
                System.out.println("Seven");
            }
            else if (nextNumber == 8) {
                System.out.println("Eight");
            }
            else if (nextNumber == 9) {
                System.out.println("Nine");
            }
        }

        if (revLength < numLength) {
            int lenDiff = numLength - revLength;

            for (int i = 0; i < lenDiff; i++) {
                System.out.println("Zero");
            }
        }

    }

   // Method to reverse a number
    public static int reverse(int number) {

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

        // Account for a value of zero
        if (number == 0) {
            reverseNumber = 0;
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

        return reverseNumber;

    }

    // Method to count digits in a number
    public static int getDigitCount(int number) {

        // Check of the number is positive
        if(number < 0) {
            return -1;
        }

        // Initialize a count variable
        int count = 0;

        // Account if digit is zero
        if (number == 0) {
            count = 1;
        }

        // Count the digits using a loop
        while(number > 0) {
            number = number / 10;
            count += 1;
        }

        // Return the count of digits
        return count;
    }

}
