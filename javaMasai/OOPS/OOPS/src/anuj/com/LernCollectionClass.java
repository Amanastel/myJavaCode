package anuj.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LernCollectionClass {
    public static void main(String[] args) {
        /*List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(23);
        list.add(54);
        list.add(24);
        list.add(23);

        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,23));

//        Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);*/

        List<Student> student = new ArrayList<>();
        student.add(new Student("ravi",33));
        student.add(new Student("priti",4));
        student.add(new Student("rahul",22));
        student.add(new Student("kunal",1));
        student.add(new Student("avishek",12));
        student.add(new Student("aman",2));

        System.out.println(student);
        Collections.sort(student);
        System.out.println(student);

        Collections.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });

//        Collections.sort(student, ((o1, o2) -> o1.name.compareTo(o2.name)));  // same like line number 38 to 43


        System.out.println(student);
    }
}
