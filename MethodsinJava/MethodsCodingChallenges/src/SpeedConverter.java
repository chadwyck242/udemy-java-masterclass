public class SpeedConverter {

    // Method to convert miles per hour to kilometers per hour
    // Returns as a long the converted milesPerHour
    public static long toMilesPerHour(double kilometersPerHour){

        // variable declarations for the unit conversion
        double milesPerHour;
        long roundedMilesPerHour;

        // If input kilometers per hour less than 0, return -1
        // else perform the conversion
        if(kilometersPerHour < 0){
            return -1;
        } else {
            milesPerHour = kilometersPerHour / 1.609; // Perform the conversion
            roundedMilesPerHour = Math.round(milesPerHour); // Round to two decimal places
        }

        return roundedMilesPerHour; // Return the rounded value
    }

    // Method to print out the converted kilometers per hour to
    // miles per hour. Takes kilometersPerHour as a parameter and is void
    public static void printConversion(double kilometersPerHour){

        long milesPerHour; // Variable declaration for printing the unit conversion

        // The input is invalid if it is less than zero
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            // Get the converted milesPerHour if zero or greater
            milesPerHour = toMilesPerHour(kilometersPerHour);

            // Print out the resulting conversion in the required format
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
