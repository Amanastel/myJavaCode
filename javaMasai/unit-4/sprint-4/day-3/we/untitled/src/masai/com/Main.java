package masai.com;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("hello");

//        Queue<Integer> q = new PriorityQueue<>();
//        q.add(10);
//        q.add(50);
//        q.add(30);
//        q.add(40);
//        q.add(70);
//        q.add(70);
////        while (!q.isEmpty()){
////            Integer i = q.poll();
////            System.out.println(i+" ");
////        }
//        System.out.println(q);



        Map<Integer, String> map = new HashMap<>();
//        System.out.println(map);
        map.put(6,"six");
        map.put(1,"one");
        map.put(2,"two");
        map.put(null,"three");
        map.put(null,"four");
        map.put(5,"five");

        Collection<String> values = map.values();

        for(String value : values){
            System.out.println(value);
        }
//        System.out.println(map.size());
//        System.out.println(map);
    }
}
