public class Main {

    public static void main(String[] args) {

        // For exercising testing purposes only
        double kilometersPerHour = -5.114;
        SpeedConverter.printConversion(kilometersPerHour);

        // Testing MegaBytes converter
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);

        // Testing BarkingDog wake-up call
        boolean wakeUp = BarkingDog.shouldWakeUp(false, 2);
        System.out.println("Should wake up: " + wakeUp);

        // Testing LeapYear checker
        boolean leaping = LeapYear.isLeapYear(1700);
        System.out.println("Is it a leap year: " + leaping);

        // Testing DecimalComparator
        boolean areEqual = DecimalComparator.areEqualByThreeDecimalPlaces(0.0, 0.0);
        System.out.println("Are they equal? " + areEqual);

        // Test EqualSumChecker
        boolean equalSum = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println("Is it an equal sum? " + equalSum);

        // Test NumberPalindrome
        boolean checkPalindrome = NumberPalindrome.isPalindrome(-1221);
        System.out.println("Is this number a palindrome? " + checkPalindrome);


    }
}
