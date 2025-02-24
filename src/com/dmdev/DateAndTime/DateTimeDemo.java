package com.dmdev.DateAndTime;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeDemo {

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        long epochMilli = zonedDateTime.toInstant().toEpochMilli();
        System.out.println(epochMilli);

        ZonedDateTime plus = zonedDateTime.plusDays(1L);
        System.out.println(plus);


    }
}
