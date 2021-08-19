package org.paumard.jepcafe;

import java.util.ArrayList;
import java.util.List;

public class A_FutureMonths {

    public static void main(String[] args) {

        int month = 8;
        List<String> futureMonths = new ArrayList<>();

        switch(month) {
            case 1: futureMonths.add("January");
            case 2: futureMonths.add("February");
            case 3: futureMonths.add("March");
            case 4: futureMonths.add("April");
            case 5: futureMonths.add("May");
            case 6: futureMonths.add("June");
            case 7: futureMonths.add("July");
            case 8: futureMonths.add("August");
            case 9: futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                     break;
            default: break;
        }

        System.out.println("futureMonths = " + futureMonths);
    }
}
