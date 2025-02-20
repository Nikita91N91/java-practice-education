package com.dmdev.exception.task;

public class Task3 {

    public static void main(String[] args) {
        try {
            unsafe();
        } catch (DmdevException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
    }

    public static void unsafe()  {
        throw new DmdevException(new RuntimeException("runtime exception"));

    }
}
