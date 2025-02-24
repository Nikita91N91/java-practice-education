package com.dmdev.DateAndTime.task;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Task6 {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);

       // LocalDateTime.of(now, LocalTime.MIDNIGHT);
        LocalDateTime localDateTime = now.atStartOfDay();
        LocalDateTime prevLocalDateTime = prevDate.atStartOfDay();

        Duration between = Duration.between(prevLocalDateTime, localDateTime);
        System.out.println(between.getSeconds());


    }
}
