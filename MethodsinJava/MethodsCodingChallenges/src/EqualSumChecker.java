public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3) {

        // Initialize variables
        boolean equalSum;
        int firstTwoSum;

        // Get the sum of the first two parameters
        firstTwoSum = num1 + num2;

        // Check if the sum is equal to the third parameter
        if(firstTwoSum == num3) {
            equalSum = true;
        }
        else {
            equalSum = false;
        }

        return equalSum;
    }
}
