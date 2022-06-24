public class Main {

    public static void main(String[] args) {

        // For exercising testing purposes only
        double kilometersPerHour = -5.114;
        SpeedConverter.printConversion(kilometersPerHour);

        // Testing MegaBytes converter
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);

        // Testing BarkingDog wake up call
        boolean wakeUp = BarkingDog.shouldWakeUp(false, 2);
        System.out.println("Should wake up: " + wakeUp);


    }
}
