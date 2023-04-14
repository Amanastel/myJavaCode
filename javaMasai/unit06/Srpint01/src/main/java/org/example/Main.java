package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 10;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
            List<Integer> integers = new ArrayList<>();
            integers.add(1);
            integers.add(2);
            integers.add(3);
            for (Integer integer : integers) {
                System.out.println(integer);
            }
        }
    }
}