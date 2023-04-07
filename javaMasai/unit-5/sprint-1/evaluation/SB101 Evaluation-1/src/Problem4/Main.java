package Problem4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(25);
        ages.add(35);
        ages.add(18);
        ages.add(20);
        ages.add(19);
        ages.add(30);
        ages.add(32);
        ages.add(43);
        ages.add(29);

        if(ages.stream().allMatch(e -> e >= 18)){
            System.out.println("You all can cast your vote");
        }else{
            System.out.println("Some or none will cast vote");
        }

        System.out.println("distinct age of all voters");
        ages.stream().distinct().forEach(System.out::println);

        System.out.println("6th youngest to 8th youngest voters ");
        ages.stream().distinct().sorted(Comparator.naturalOrder()).skip(5).limit(3).forEach(System.out::println);

        System.out.println("addition age of all voters");
        System.out.println(ages.stream().reduce(0, Integer::sum));


        System.out.println("The BinaryOperator interface is a subinterface of the Function interface such that both are SAM interfaces "+
                (BinaryOperator.class.getInterfaces()[0] == Function.class));

        System.out.println("The BiConsumer interface is a subinterface of the Consumer interface such that both are SAM interfaces "+
                (BiConsumer.class.getInterfaces()[0] == Consumer.class));
    }
}
