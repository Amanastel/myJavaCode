package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {


        // Stream API - collection process
        // collection / group of object

        //1- black
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e-> System.out.println(e));
//        emptyStream.forEach(System.out::println);

        //2-array, object,collection
        String[] names = {"aman","anshika","Zhanna","astel"};
        Stream<String> strea = Stream.of(names);
        strea.forEach(e->System.out.println(e));
//        strea.forEach(System.out::println);

        //3
        Stream<Object> streamBuilder = Stream.builder().build();


        //4
        IntStream stream =  Arrays.stream(new int[]{2,4,5,65,6,4,3,546});
//        stream.forEach(e-> System.out.println(e));
        stream.forEach(System.out::println);


        System.out.println("-----------------");
        //5- list, Set
        List<Integer> list2 = new ArrayList<>();
        list2.add(14);
        list2.add(32);
        list2.add(43);
        list2.add(21);
        list2.add(12);

        Stream<Integer> stream1 = list2.stream();
        stream1.forEach(e-> System.out.println(e));
    }
}
