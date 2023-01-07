public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3) {

        // Initialize variables
        boolean equalSum;
        int firstTwoSum;

        // Get the sum of the first two parameters
        firstTwoSum = num1 + num2;

        // Check if the sum is equal to the third parameter
        equalSum = firstTwoSum == num3;

        return equalSum;
    }
}
