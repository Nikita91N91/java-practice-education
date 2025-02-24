package com.dmdev.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    private String firsName;

    public Person(int age, String firsName) {
        this.age = age;
        this.firsName = firsName;
    }

    public int getAge() {
        return age;
    }

    public String getFirsName() {
        return firsName;
    }



    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firsName='" + firsName + '\'' +
                '}';
    }
}
