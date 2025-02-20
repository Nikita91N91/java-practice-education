package com.dmdev.fuctionalProgrammer.task;

import java.util.Map;

public class Task3 {

    public static void main(String[] args) {

        Map<String, Integer> map = Map.of(
                "string1", 1,
                "strin5", 2,
                "string2", 3,
                "string4", 5,
                "strin2", 5
        );
        int result = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(result);
    }
}
