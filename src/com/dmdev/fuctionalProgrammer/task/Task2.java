package com.dmdev.fuctionalProgrammer.task;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        List<String> strings = List.of(
                "srting-1",
                "srting-2",
                "srting-3",
                "srting-4",
                "srting-10",
                "srting-10",
                "srting-10",
                "srting-12",
                "srting-16"
        );
        int result = strings.stream()
                .filter(value -> value.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(result);

        long result2 = strings.stream()
                .filter(value -> value.length() > 8)
                .distinct()
                .count();
        System.out.println(result2);
    }
}
