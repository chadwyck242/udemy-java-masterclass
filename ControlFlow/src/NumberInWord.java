public class NumberInWord {

    // Number in Word exercise in Control Flow section of course

    public static void printNumberInWord(int number) {

        // String variable for printing required number
        String wordString;

        // Switch statement to check the number is between 0 - 9
        // and print the word or print other if not
        switch (number) {
            case 0: wordString = "ZERO";
            break;
            case 1: wordString = "ONE";
            break;
            case 2: wordString = "TWO";
            break;
            case 3: wordString = "THREE";
            break;
            case 4: wordString = "FOUR";
            break;
            case 5: wordString = "FIVE";
            break;
            case 6: wordString = "SIX";
            break;
            case 7: wordString = "SEVEN";
            break;
            case 8: wordString = "EIGHT";
            break;
            case 9: wordString = "NINE";
            break;
            default: wordString = "other";
            break;
        }

        // Print out the result of the case statement
        System.out.println(wordString);
    }
}
