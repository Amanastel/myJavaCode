package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("hello");

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

        List<Integer> listEven = new ArrayList<>();

        System.out.println(listEven);
        for(Integer i: list1){
            if(i%2==0){
                listEven.add(i);
            }
        }
        System.out.println(list1);
        System.out.println(listEven);
    }
}
