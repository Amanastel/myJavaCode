package anuj.com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class lernSet {
    public static void main(String[] args) {
        /*Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();  // order are same
//        Set<Integer> set = new TreeSet<>(); // element are sorted and order are same

        set.add(1);
        set.add(20);
        set.add(90);
        set.add(80);
        set.add(50);

        set.add(80); // do not add same value
        set.add(80); // do not add same value
        set.add(80); // do not add same value
        System.out.println(set);
        System.out.println(set);
        set.remove(50);
        System.out.println(set);
        System.out.println(set.contains(80));  //set.contains() check if value are there then return ture else false
        System.out.println(set.isEmpty());*/
        Set<Integer> set = new TreeSet<>(); // element are sorted and order are same
        set.add(1);
        set.add(20);
        set.add(20);
        set.add(90);
        set.add(80);
        set.add(50);
        set.add(80); // do not add same value
        set.add(80); // do not add same value
        set.add(80); // do not add same value
        System.out.println(set);
//        System.out.println(set.contains("3"));
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("aman",2));
        studentSet.add(new Student("rahul",3));
        studentSet.add(new Student("Abhishek",4));
        studentSet.add(new Student("rubel",5));
        studentSet.add(new Student("priti",5));

        System.out.println(studentSet);
    }
}
