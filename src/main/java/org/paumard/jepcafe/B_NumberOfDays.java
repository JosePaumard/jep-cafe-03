package org.paumard.jepcafe;

public class B_NumberOfDays {

    public static void main(String[] args) {

        int year = 2021;
        int month = 8;

        int numDays = -1;
        switch(month) {
            case 1: case 3: case 5:  // January March May
            case 7: case 8: case 10: // July August October
            case 12:
                numDays = 31;
                break;
            case 4: case 6:  // April June
            case 9: case 11: // September November
                numDays = 30;
                break;
            case 2: // February
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                    || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

        System.out.println("numDays = " + numDays);
    }
}
