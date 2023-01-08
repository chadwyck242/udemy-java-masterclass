public class NumberOfDaysInMonth {

    // Method returns true if year is a leap year, false otherwise
    public static boolean isLeapYear(int year){
        boolean leapYear = true;

        // Check if year is within required range
        if (year < 0 || year > 9999) {
            return false;
        }

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

    // Method to return number of days in a month,
    // accounting for leap years as well
    public static int getDaysInMonth(int month, int year) {

        // check if year argument is a leap year, and store in a boolean
        boolean checkLeapYear = isLeapYear(year);

        // variable to store days
        int days = 0;

        // Check if month and year are within required ranges
        if (month < 1 || month > 12) {
            return -1;
        }
        else if (year < 1 || year > 9999) {
            return -1;
        }

        // Return number of days in provided month
        if (month == 1) {
            days = 31;
        }
        else if (month == 2) {
            if (checkLeapYear) {
                days = 29;
            } else {
                days = 28;
            }
        }
        else if (month == 3) {
            days = 31;
        }
        else if (month == 4) {
            days = 30;
        }
        else if (month == 5) {
            days = 31;
        }
        else if (month == 6) {
            days = 30;
        }
        else if (month == 7) {
            days = 31;
        }
        else if (month == 8) {
            days = 31;
        }
        else if (month == 9) {
            days = 30;
        }
        else if (month == 10) {
            days = 31;
        }
        else if (month == 11) {
            days = 30;
        }
        else if (month == 12) {
            days = 31;
        }

        // Return the number of days in the given month
        return days;

    }

}
