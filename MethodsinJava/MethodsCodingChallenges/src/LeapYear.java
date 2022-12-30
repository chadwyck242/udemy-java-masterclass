public class LeapYear {
    public static boolean isLeapYear(int year){
        boolean leapYear = true;

        if(year < 1 || year > 9999){
            return false;
        }

        if(year % 4 == 0){
            if(year % 100 == 0){
                leapYear = year % 400 == 0;
            } else {
                leapYear = true;
            }
        } else {
            leapYear = false;
        }

        return leapYear;
    }
}
