//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        for(int i=0; i<5; i++){
//            System.out.println("hello world! "+ i);
//        }
//    }
//}

//Rotate Elements
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        // read input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // rotate each ring of the matrix
        int r = n / 2; // number of rings
        for (int i = 0; i < r; i++) {
            int first = matrix[i][i];
            // rotate top row
            for (int j = i; j < n - i - 1; j++) {
                matrix[i][j] = matrix[i][j + 1];
            }
            // rotate right column
            for (int j = i; j < n - i - 1; j++) {
                matrix[j][n - i - 1] = matrix[j + 1][n - i - 1];
            }
            // rotate bottom row
            for (int j = n - i - 1; j > i; j--) {
                matrix[n - i - 1][j] = matrix[n - i - 1][j - 1];
            }
            // rotate left column
            for (int j = n - i - 1; j > i + 1; j--) {
                matrix[j][i] = matrix[j - 1][i];
            }
            matrix[i + 1][i] = first;
        }
        // print rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
//        System.out.println("Hello world!");
    }
}

//2D Array and Sum
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int k = sc.nextInt();
//        int[][] mat = new int[n][m];
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<m; j++) {
//                mat[i][j] = sc.nextInt();
//            }
//        }
//        int count=0;
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<m-2; j++) {
//                if (mat[i][j] + mat[i][j+1] + mat[i][j+2]==k) {
//                    count++;
//                }
//            }
//        }
//        for (int i=0; i<n-2; i++) {
//            for (int j=0; j<m; j++) {
//                if (mat[i][j] + mat[i+1][j] + mat[i+2][j]==k) {
//                    count++;
//                }
//            }
//        }
//        for (int i=0; i<n-2; i++) {
//            for (int j=0; j<m-2; j++) {
//                if (mat[i][j]+mat[i+1][j+1]+mat[i+2][j+2]==k) {
//                    count++;
//                }
//                if (mat[i+2][j]+mat[i+1][j+1]+mat[i][j+2]==k) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}
