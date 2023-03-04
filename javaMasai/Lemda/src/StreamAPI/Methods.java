package StreamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {

        // filter(Predicate)
            // boolean value function

        List<String> names = List.of("aman","kuldeep","ankit","abhinav", "kartik","loan");
        names.stream().filter(e->e.startsWith("k")).forEach(e-> System.out.println(e));

        List<String>newName = names.stream().filter(e->e.startsWith("l")).collect(Collectors.toList());
        System.out.println(newName);


        // map(Function)

        List<Integer> numbers = List.of(23,4,6,7,8,9,5,3,2);
        numbers.stream().map(i->i*i).forEach(e-> System.out.println(e));
//        numbers.stream().map(i->i*i).forEach(System.out::println);

        List<Integer> numbers1 = List.of(23,4,6,7,8,9,5,3,2);
        List<Integer> num = numbers1.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(num);


//        names.stream().forEach(e-> System.out.println(e));

        System.out.println("-----------------------");
        // sort
        numbers.stream().sorted().forEach(e-> System.out.println(e));

        System.out.println("-----------------------");
        Integer integer = numbers.stream().min((x,y)->x.compareTo(y)).get();
        Integer integer2 = numbers.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(integer);
        System.out.println(integer2);
    }
}
