package anuj.com;

import java.util.Arrays;

public class LernArrayClass {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        int n = Arrays.binarySearch(num,5); // it will be return index of element

        System.out.println(n);


        int[] arr = {10,2,3,5,6,7,88,34,54,53};

        Arrays.fill(arr, 12);  // change the all element value and add the same value
        Arrays.sort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }


    }
}
