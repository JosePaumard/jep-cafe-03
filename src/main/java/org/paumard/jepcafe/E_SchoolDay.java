/**
 * Copyright 2021 José Paumard
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

