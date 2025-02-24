package com.dmdev.DateAndTime.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task3 {

    public static void main(String[] args) {
        String formatedDate = "26-03-1968T09:24";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(formatedDate, dateTimeFormatter);
        System.out.println(localDateTime);
    }
}
