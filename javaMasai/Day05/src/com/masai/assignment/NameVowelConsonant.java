package com.masai.assignment;

public class NameVowelConsonant {
//	static int getVowelCount(String s) {
//		int count = 0;
//		String[] arr=s.split("");
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {
//				count++;
//			}
//		}
//		return count ;
//	  }
//	public static void main(String args[]) {
//		System.out.println("Total vowel in Rajesh is " + getVowelCount("Rajesh"));
//	    System.out.println("Total vowel in Yogita is " + getVowelCount("Yogita"));
//	}
	
	public static void main(String[] args) {
        System.out.println(fibo(94));
    }
    static int fibo(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
