public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        //Initialize boolean variable for waking up or not
        boolean wakeUp;

        if(hourOfDay < 0 || hourOfDay > 23){
            wakeUp =false; // Must be in range 0-23 hours
        }
        else if((hourOfDay < 8 || hourOfDay > 22) && barking){
            wakeUp = true;
        } else {
            wakeUp = false;
        }

        return wakeUp;
    }
}
