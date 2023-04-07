package aman.com;

public class Number {
    public static void main(String[] args) {
        printNum(1);
    }

    static void printNum(int n){
        System.out.println(n);
        printNum2(2);
    }
    static void printNum2(int n){
        System.out.println(n);
        printNum3(3);
    }
    static void printNum3(int n){
        System.out.println(n);
        printNum4(4);
    }
    static void printNum4(int n){
        System.out.println(n);
        printNum5(5);
    }
    static void printNum5(int n){
        System.out.println(n);
    }

}
