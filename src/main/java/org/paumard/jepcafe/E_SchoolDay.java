package org.paumard.jepcafe;

public class E_SchoolDay {

    public static void main(String[] args) {

        enum DayOfWeek {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
        }

        DayOfWeek day = DayOfWeek.WEDNESDAY;

        String activity =
                switch (day) {
                    case MONDAY, TUESDAY  -> {
                        System.out.println("school");
                        yield "school";
                    }
                    case WEDNESDAY        -> {
                        System.out.println("music and sport");
                        yield "music and sport";
                    }
                    case THURSDAY, FRIDAY -> {
                        System.out.println("more school");
                        yield "more school";
                    }
                };
        System.out.println("activity = " + activity);
    }
}

