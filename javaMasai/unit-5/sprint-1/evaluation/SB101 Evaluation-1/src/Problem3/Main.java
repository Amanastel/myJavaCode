package Problem3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aman");
        names.add("Rahul");
        names.add("Ravi");
        names.add("Kuldeep");
        names.add("Chunnu");
        names.add("Munnu");
        names.add("Avishek");
        names.add("Sunil");
        names.add("Manish");
        names.add("Priyanka");

        List<String> transformedList = names.stream().filter(name -> name.length()%2==0).map(String::toUpperCase).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Original Name");
        names.forEach(e-> System.out.println(e));

        System.out.println("=====================");
        System.out.println("Transformed List");
        transformedList.forEach(e-> System.out.println(e));
    }

}
