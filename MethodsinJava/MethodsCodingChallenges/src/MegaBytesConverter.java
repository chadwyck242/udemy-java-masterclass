public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        // Initialize variables to store megabytes and kilobytes
        int megabytes = 0;
        int kilobytes = 0;

        // Only perform the calculation if kiloBytes greater than zero
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            // Use division to obtain the number of megabytes
            megabytes = Math.round(kiloBytes / 1024);

            // Use the modulus operator to get kilobytes remaining
            kilobytes = kiloBytes % 1024;

            // Print the conversion out to the console
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytes + " KB");
        }

    }

}
