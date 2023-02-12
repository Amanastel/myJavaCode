package aman.com;

import java.util.Scanner;

public class NewP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the matrix: ");
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++) {
            d1 += a[i][i];
            d2 += a[i][n - i - 1];
        }
        int difference = Math.abs(d1 - d2);
        System.out.println("The difference of sum of the diagonal is " + difference);
    }
}

