class Recursion {
//    public static void printNum(int n) {
//        if(n == 0){
//            return;
//        }
//        System.out.println(n);
//        printNum(n-1);
//    }
//
//    public static void main(String[] args) {
//	// write your code here
//        int n = 5;
//        printNum(n); //n=5
//
//    }
//public static void printAman(int n) {
//    if(n == 6){
//        return;
//    }
//    System.out.println(n);
//    printAman(n+1);
//}
//    public static void main(String[] args) {
//        // write your code here
//        int n = 1;
//        printAman(n); //n=1

public static void printSum(int i, int n, int sum) {
    if (i == n) {
        sum += i;
        System.out.println(sum);
    }
    sum += i;
    printSum(i+1, n, sum);
}
public static void main(String[] args) {
    printSum(1, 5, 0);
}
}
