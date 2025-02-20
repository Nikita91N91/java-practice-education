package com.dmdev.fuctionalProgrammer.task;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {

    public static void main(String[] args) {
        List<Integer> integers = List.of(5, 2, 4, 2, 1);
        String collect = integers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(collect);
    }
}
