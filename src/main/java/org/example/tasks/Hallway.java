package org.example.tasks;

import java.util.regex.Pattern;

public class Hallway {
    public static int contact(String hallway) {
        int minNumOfSteps = -1;
        int distance = -1;
        int temp;
        char[] symbols = hallway.toCharArray();
        for (char c : symbols) {
            if (c == '>') {
                distance = 0;
            } else if (distance >= 0) {
                if (c == '<') {
                    temp = distance / 2 + 1;
                    if (minNumOfSteps == -1 || temp < minNumOfSteps) {
                        minNumOfSteps = temp;
                    }
                } else {
                    distance++;
                }
            }
        }
        return minNumOfSteps;
    }

    public static int contactByPattern(String hallway) {
        return Pattern.compile(">-*<").matcher(hallway).results().mapToInt(r -> r.group().length() / 2).min().orElse(-1);
    }

}
