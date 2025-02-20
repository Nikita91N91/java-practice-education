package com.dmdev.fuctionalProgrammer.task;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Task5 {

    public static void main(String[] args) {
        List<Person> pearsons = List.of(
                new Person("Ivan", "Ivanov", 20),
                new Person("Petr", "Petrov", 25),
                new Person("Sveta", "Svetikova", 33),
                new Person("Kate", "Ivanova", 25),
                new Person("Slava", "Slavikov", 18),
                new Person("Arni", "Kutuzov12345", 56)
        );

        pearsons.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer,List<String>> map = pearsons.stream()
                .collect(groupingBy(Person::getAge,
                        Collectors.mapping(Person::getFullName,Collectors.toList())));
        System.out.println(map);
    }
}
