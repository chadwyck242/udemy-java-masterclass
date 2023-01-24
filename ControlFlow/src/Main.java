public class Main {
    public static void main(String[] args) {

        // Test printNumberInWord method
        NumberInWord.printNumberInWord(9);
        NumberInWord.printNumberInWord(-4);

        // Test getDaysInMonth method
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));

        // Test sumOdd method
        System.out.println(SumOddRange.sumOdd(2, 15));

        // Check isPalindrome method
        boolean isPalindrome = NumberPalindrome.isPalindrome(-1221);
        System.out.println("Is this number a palindrome? " + isPalindrome);

        // Test sumFirstAndLastDigit method
        System.out.println("The sum of the first and last digits is: " + FirstandLastDigitSum.sumFirstAndLastDigit(5567));

    }
}