package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class StreamMain {
    public static void main(String[] args) {
//        System.out.println("hello");

        // Create a List and Filter all even Number form list

//        List<Integer> list1 = new java.util.ArrayList<>(List.of(2, 3, 50, 12, 23, 43, 434, 55));
//        list1.add(34);

        List<Integer> list1 = List.of(2,3,50,12,23,43,434,55);

        List<Integer> list2 = new ArrayList<>();
        list2.add(14);
        list2.add(32);
        list2.add(43);
        list2.add(21);
        list2.add(12);

        List<Integer> list3 = Arrays.asList(23,567,12,677,24);

        Stream<Integer> data = list3.stream(); // we have to use stream once time only
//        data.forEach(i-> System.out.println(i));

        Stream<Integer> sortData = data.sorted(); // we have to use stream once time only
//        sortData.forEach(i-> System.out.println(i));
        //data.forEach(i-> System.out.println(i));  we have to use stream once time only



        List<Integer> listEven = new ArrayList<>();

//        System.out.println(listEven);
        for(Integer i: list1){
            if(i%2==0){
                listEven.add(i);
            }
        }

        Stream<Integer> stream = list1.stream();
//        System.out.println(stream);
        List<Integer> collecct = stream.filter(i->i%2==0).collect(Collectors.toList());
//        System.out.println(collecct);


        List<Integer> listNumbers = Arrays.asList(10, 10, 20, 50, 78, 96, 14, 35);

        listNumbers.stream().distinct().forEach(i-> System.out.print(i + " "));
        System.out.println();
        listNumbers.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));
        System.out.println();
        listNumbers.stream().distinct().filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " "));

        List<String> nameList = Arrays.asList("abc","bcv","kks","aman","astel");
//        System.out.println();
        System.out.println();
        Function<String,Integer> fn = name -> name.length();
//        List<Integer> listLength = nameList.stream().map(fn).toList();
        List<Integer> listLength = nameList.stream().filter(name -> name.length()>3).map(fn).toList();
        listLength.forEach(i -> System.out.print (i + " "));


        System.out.println();
        nameList.stream().sorted().forEach(i -> System.out.println(i));
        System.out.println();







    }
}
