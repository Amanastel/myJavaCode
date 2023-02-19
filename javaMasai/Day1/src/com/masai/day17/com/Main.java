package day17.com;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,12,3,-44,55,1,22};
        System.out.println(arr);

        String result = Arrays.toString(arr);
        System.out.println(result);

        Arrays.sort(arr);
        System.out.println(arr);

        System.out.println(Arrays.toString(arr));


        int index = Arrays.binarySearch(arr,12);
        System.out.println(index);


        List<Integer> lis = new ArrayList<>();
        List<Integer> s1 = Arrays.asList(12,10,50,30,15);
        System.out.println(s1);
    }
}
