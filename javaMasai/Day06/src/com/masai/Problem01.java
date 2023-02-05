

//Problem Statement: Write a program to input an array of N X N size (i.e. it is square matrix) then find the difference of sum of diagonal elements.
//
//Sample Input
//Enter the Size of the matrix: 4
//Enter elements of matrix:
//1 2 3 4
//5 6 3 1
//7 1 2 3
//5 8 4 6
//
//Sample Output
//The difference of sum of the diagonal is 2
//
//Explanation
//The addition of elements of first diagonal is 1 + 6 + 2 + 6 = 15
//The addition of elements of second diagonal is 5 + 1 + 3 + 4 = 13
//The difference of 15 – 13 is 2


package com.masai;
import java.util.Scanner;

public class Problem01 {
	 public static void main(String[] args) { 
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the Size of the matrix: ");
	     int n = sc.nextInt();
	     int[][] arr = new int[n][n];
	     System.out.println("Enter elements of matrix: ");
	     for(int i = 0; i < n; i++) {	    	 
	         for(int j = 0; j < n; j++) {
	              arr[i][j] = sc.nextInt();
	         }
	     }
	     int d1 = 0, d2 = 0;
	     for(int i = 0; i < n; i++) {
	           d1 += arr[i][i];
	           d2 += arr[i][n - i - 1];
	      }
	      int difference = Math.abs(d1 - d2);
	      System.out.println("The difference of sum of the diagonal is " + difference);
	      
	 }
}


