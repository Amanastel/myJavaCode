package anuj.com;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Arrays;

public class LernMap {
    public static void main(String[] args) {
//        Map<String, Integer> number = new HashMap<>();  // time complexity O(1)
       /* Map<String, Integer> number = new TreeMap<>();  // sort by key -- time complexity O log(n)
        number.put("One", 1);
        number.put("Two", 2);
        number.put("Tree", 3);
        number.put("Four", 4);
        number.put("Five", 5);

        if(!number.containsKey("four")){  // if key are there so value is not add
            number.put("four", 6);
        }

        number.putIfAbsent("two",33);  // if key are there so value is not add

        number.remove("One");
        System.out.println(number.containsValue(33));  // if value are there so return true else false
        System.out.println(number.isEmpty()); // check map is empty or not

//        System.out.println(number);


        for(Map.Entry<String, Integer> ele: number.entrySet()){
            System.out.println(ele);
            System.out.println(ele.getKey());
            System.out.println(ele.getValue());
        }

        System.out.println("---------");
        for(String key : number.keySet()){
            System.out.println(key);
        }

        System.out.println("---------");
        for(int key : number.values()){
            System.out.println(key);
        }
        System.out.println(number);*/

        HashMap<String, Integer> name = new HashMap<>();
//        name.put("aman",1);
//        name.put("himanshu",1);
//        name.put("sushil",2);

        String[] str = {"himanshu","aman","sushil","rubel","sushil","rubel","sushil"};

        for(int i=0; i< str.length; i++){
            if(name.containsKey(str[i])){
//                name.put(str[i],name.get(str[i])+1);
            }else{
                name.put(str[i],1);
            }
        }

        System.out.println(name);

        for(Map.Entry<String, Integer> elm: name.entrySet()){
            if(elm.getValue()>2){
                System.out.println(elm.getValue());
            }
        }


    }
}
