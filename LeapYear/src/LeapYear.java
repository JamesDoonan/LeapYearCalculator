public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {

            //step 1

            if (year % 4 == 0) {

                //step 2

                if (year % 100 == 0) {

                    //step 3

                    if (year % 400 == 0) {

                        //step 4

                        return true;

                    } else return false;

                } else return true;

            } else return false;

        } else

            return false;

    }

}




























