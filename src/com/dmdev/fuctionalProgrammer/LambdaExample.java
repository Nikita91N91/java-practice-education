package com.dmdev.fuctionalProgrammer;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compare;
        System.out.println(comparator.compare(23,100));

        // private static class IntegerComparator implements Comparator<Integer> {

//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return Integer.compare(o1, o2);
//        }
    }
}
