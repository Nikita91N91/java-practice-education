package com.dmdev.exception.task;

public class Task1 {

    public static void main(String[] args) {
        String value = null;
        try {
            value.length();
        } catch (NullPointerException exception) {
            System.out.println("catch");
            exception.printStackTrace();
        }
    }
}
