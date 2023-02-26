package anuj.com;

import java.util.LinkedList;
import java.util.Queue;

public class LernQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(34);
        queue.offer(12);
        queue.offer(22);
        queue.offer(32);
        queue.offer(42);
        queue.offer(52);
        queue.offer(92);
        queue.offer(62);


        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
