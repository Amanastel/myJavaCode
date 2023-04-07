package CollectionsFramework.com;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class CollectionFramework {
    public static void main(String[] args) {
        /*
        ArrayList<String> name = new ArrayList<String>();
        System.out.println(name);
        name.add("ankit");
        name.add("aman");
        name.add("Anshika");
        System.out.println(name);
        name.add(1,"astel");
        System.out.println(name);
        name.remove("astel");
        name.remove(0);
        System.out.println(name);

        name.set(0,"aman love anshika");
//        name.clear(); // clear delete all value
        System.out.println(name);
        System.out.println(name.get(1));

         */


        /*
        LinkedList<String> str = new LinkedList<String>();
        str.add("aman");
        str.add("astel");
        str.add("Anshika");
        str.add("singh");
        str.addFirst("first");
        str.addLast("last");
        System.out.println(str);

        str.add(3,"love");
        System.out.println(str);

        str.remove(0);
        str.removeLast();
        System.out.println(str);

        for(String name: str){
            System.out.println(name);
        }

         */


    /*
        Stack<String> name1 = new  Stack<>();
        name1.add("aman");
        name1.add("astel");
        name1.add("love");
        System.out.println(name1);
        name1.push("astell");
        System.out.println(name1);
        name1.pop();
        System.out.println(name1);

     */



        ArrayDeque<String> name = new ArrayDeque<>();
        name.push("aman");
        name.push("astel");
        name.push("singh");
        name.add("as");

        System.out.println(name);
        name.pop();
        name.pop();

        System.out.println(name);
    }
}
