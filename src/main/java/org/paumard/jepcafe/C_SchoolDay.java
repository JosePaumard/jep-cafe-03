package org.paumard.jepcafe;

public class C_SchoolDay {

    public static void main(String[] args) {

        enum DayOfWeek {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
        }

        DayOfWeek day = DayOfWeek.WEDNESDAY;

        switch (day) {
            case MONDAY:
            case TUESDAY:
                System.out.println("school");
                break;
            case WEDNESDAY:
                System.out.println("music and sport");
                break;
            case THURSDAY:
            case FRIDAY:
                System.out.println("more school");
                break;
        }
    }
}

