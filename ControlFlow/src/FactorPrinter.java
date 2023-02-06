public class FactorPrinter {

    public static void printFactors(int number) {
        // Check if number within required range
        if (number < 1) {
            System.out.println("Invalid Value");
        }

        // Extract the factors from the number and print them
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

}
