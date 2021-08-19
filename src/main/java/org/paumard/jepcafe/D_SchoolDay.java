package org.paumard.jepcafe;

public class D_SchoolDay {

    public static void main(String[] args) {

        enum DayOfWeek {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
        }

        DayOfWeek day = DayOfWeek.WEDNESDAY;

        String activity =
                switch (day) {
                    case MONDAY, TUESDAY  -> "school";
                    case WEDNESDAY        -> "music and sport";
                    case THURSDAY, FRIDAY -> "more school";
                };
        System.out.println("activity = " + activity);
    }
}

