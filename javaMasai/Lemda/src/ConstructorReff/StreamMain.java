package ConstructorReff;

import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> integers = List.of(14,122,45,677,678,46);
        System.out.println(integers);

        integers.stream().forEach(e ->{
            System.out.println(e);
        });

        integers.stream().forEach(System.out::println);

        integers.forEach(System.out::println);
    }
}
