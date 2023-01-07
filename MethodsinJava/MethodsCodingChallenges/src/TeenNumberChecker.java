public class TeenNumberChecker {

    public static boolean hasTeen(int age1, int age2, int age3) {

        // Initialize boolean variable
        boolean isTeen;

        // Check each parameter within the required range
        // to be a teen
        if(age1 >= 13 && age1 <= 19) {
            isTeen = true;
        }
        else if(age2 >= 13 && age2 <= 19) {
            isTeen = true;
        }
        else isTeen = age3 >= 13 && age3 <= 19;

        return isTeen;
    }

    public static boolean isTeen(int age) {

        // Initialize boolean variable
        boolean isTeen;

        // Check if age is in required age range to be a teen
        isTeen = age >= 13 && age <= 19;

        return isTeen;
    }
}
