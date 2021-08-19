package org.paumard.jepcafe;

public class F_SchoolDay {

    public static void main(String[] args) {

        enum DayOfWeek {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
        }

        DayOfWeek day = DayOfWeek.WEDNESDAY;

        String activity =
                switch (day) {
                    case MONDAY  :
                    case TUESDAY :
                        yield "school";
                    case WEDNESDAY : {
                        System.out.println("music and sport");
                        yield "music and sport";
                    }
                    case THURSDAY, FRIDAY :
                        yield "more school";
                };
        System.out.println("activity = " + activity);
    }
}

