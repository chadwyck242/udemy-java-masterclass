public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        boolean isPlaying;

        if (temperature >= 25 && temperature <= 35) {
            isPlaying = true;
        }
        else if ((temperature >= 25 && temperature <= 45) && summer == true) {
            isPlaying = true;
        } else {
            isPlaying = false;
        }

        return isPlaying;
    }

}
