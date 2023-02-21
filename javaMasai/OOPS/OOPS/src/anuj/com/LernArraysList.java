package anuj.com;

import java.util.ArrayList;
import java.util.Iterator;

public class LernArraysList {
    public static void main(String[] args) {
        /*ArrayList<String> str = new ArrayList<>();
        str.add("aman");
//        System.out.println(str);

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(20);
        num.add(90);
        num.add(1,30);
        System.out.println(num);

        ArrayList<Integer> newNum = new ArrayList<>();
        newNum.add(120);
        newNum.add(29);
        num.addAll(newNum);  // add arrays newNum to num
        System.out.println(num.get(1));
        System.out.println(num);*/


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        System.out.println(list+" --- "+list.size());
        System.out.println(list.get(2));
        list.remove(2);
        list.remove(Integer.valueOf(80));
        System.out.println(list.get(2));
        System.out.println(list+" --- "+list.size());

        list.set(1,1000);  // set update the value
        System.out.println(list);

        System.out.println("------");

        System.out.println(list.contains(50)); //   list.contains() ---> check is value are there then it will return true else false
        System.out.println(list.contains(500));

        /*list.clear(); // this will remove all element
        System.out.println(list+" --- "+list.size());*/


        for(int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("------");

        for (Integer ele: list){
            System.out.println(ele);
        }

        System.out.println("------");

        Iterator<Integer> it =  list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

