package com.dmdev.map.task;

import java.util.*;

public class Task4 {

    public static void main(String[] args) {
        Map<Integer, Integer> polynomial1 = Map.of(
                0, 5,
                1, 3,
                3, 2,
                5, 4,
                6, 7
        );
        Map<Integer, Integer> polynomial2 = Map.of(
                0, 5,
                3, 4,
                5, 5,
                6, 1
        );

        String result = converToString(sum(polynomial1, polynomial2));
        System.out.println(result);
    }

    public static String converToString(Map<Integer, Integer> map) {
        Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);
        List<String> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            String value = entry.getKey() == 0
                    ? String.valueOf(entry.getValue())
                    : entry.getValue() + "x^" + entry.getKey();
            list.add(value);

        }
        return String.join(" + ",list);
    }

    public static Map<Integer, Integer> sum(Map<Integer, Integer> polynomial1,
                                            Map<Integer, Integer> polynomial2) {
        Map<Integer, Integer> polynomialResult = new HashMap<>(polynomial1);
        for (Map.Entry<Integer, Integer> entry : polynomial2.entrySet()) {
//            Integer value = polynomialResult.getOrDefault(entry.getKey(), 0);
//            polynomialResult.put(entry.getKey(), value + entry.getValue());
            polynomialResult.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }

        return polynomialResult;
    }
}
