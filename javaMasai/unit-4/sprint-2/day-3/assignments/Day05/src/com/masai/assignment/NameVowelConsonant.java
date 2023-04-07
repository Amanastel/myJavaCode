package com.masai.assignment;

public class NameVowelConsonant {
	static int getVowelCount(String s) {
//	    write code to count vowels and return
		int count = 0;
		String[] arr=s.split("");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("a") || arr[i].equals("e") || arr[i].equals("i") || arr[i].equals("o") || arr[i].equals("u")) {
				count++;
			}
//			System.out.println(count);
		}
		return count ;
	  }
	public static void main(String args[]) {
		System.out.println("Total vowel in Rajesh is " + getVowelCount("Rajesh"));
	    System.out.println("Total vowel in Yogita is " + getVowelCount("Yogita"));
	}
}
