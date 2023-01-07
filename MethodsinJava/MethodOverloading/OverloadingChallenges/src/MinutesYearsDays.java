public class MinutesYearsDays {

    public static void printYearsAndDays(long minutes) {

        // Validate that minutes are greater than zero
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            // Calculate Years and Days from Minutes
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long daysRemaining = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + daysRemaining + " d");
        }

    }

}
