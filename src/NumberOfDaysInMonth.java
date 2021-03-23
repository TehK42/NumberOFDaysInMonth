public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        //If given value is not between 1 - 9999 then return as false
        if(year < 1 || year > 9999){
            return false;
        } else{
            //If given value's remainder is equal to 0 after dividing by 4
            //Also checks if given value's remainder is not equal to 0 after dividing by 100
            //Then return true
            if(year % 4 == 0 && year % 100 != 0){
                return true;
            }else if(year % 400 == 0) {
                //If given value's remainder is equal to 0 after dividing by 400
                //Return true
                return true;
            }else{
                return false;
            }
        }

    }

    public static int getDaysInMonth(int month, int year){
        //Checks if given month and year is valid
        //Month cannot be less than 1 and greater than 12
        //Year cannot be less than 1 and greater than 9999
        if(((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))){
            return -1;
        }

        //Return the value of the number of days in the month
        //Case '2' checks if it is a leap year or not
        //Return the value of if its a leap year or not
        //Else return nothing
        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if(isLeapYear(year)) {
                    return 29;
                }else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}
