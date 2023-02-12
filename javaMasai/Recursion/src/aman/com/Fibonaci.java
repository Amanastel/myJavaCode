package aman.com;

public class Fibonaci {
    public static void main(String[] args) {
        int ans = fibo(4);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
