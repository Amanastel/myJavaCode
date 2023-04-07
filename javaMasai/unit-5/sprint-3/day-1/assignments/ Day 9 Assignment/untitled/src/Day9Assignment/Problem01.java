package Day9Assignment;


class FibonacciThread extends Thread {
    public void run() {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print("Fibonacci Series: " + n1 + " " + n2);

        for (i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

class ReverseOrderThread extends Thread {
    public void run() {
        System.out.print("reverse order: ");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

public class Problem01 {
    public static void main(String[] args) {
        FibonacciThread fibonacciThread = new FibonacciThread();
        ReverseOrderThread reverseOrderThread = new ReverseOrderThread();
        fibonacciThread.start();
        reverseOrderThread.start();
    }
}
