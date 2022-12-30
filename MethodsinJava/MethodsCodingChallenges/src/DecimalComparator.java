public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        boolean areEqual;

        int convertedNum1;
        int convertedNum2;

        // Cast the numbers into integers after moving decimal three places right
        convertedNum1 = (int) (num1 * 1000);
        convertedNum2 = (int) (num2 * 1000);

        // Check if the numbers are equal
        areEqual = convertedNum1 == convertedNum2;

        return areEqual;
    }
}
