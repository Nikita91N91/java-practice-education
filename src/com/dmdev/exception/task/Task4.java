package com.dmdev.exception.task;

public class Task4 {

    public static void main(String[] args) {
        try {
            catchCustomException();
        } catch (DmdevException exception) {
            System.out.println("catched in main");
            exception.printStackTrace();
        }

    }

    public static void catchCustomException() {
        try {
            unsafe();
        } catch (RuntimeException exception) {
            System.out.println("Catch int catchCustomException method");
            throw new DmdevException(exception);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("ooops");
    }
}
