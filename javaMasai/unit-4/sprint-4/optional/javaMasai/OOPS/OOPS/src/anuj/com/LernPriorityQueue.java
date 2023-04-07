package anuj.com;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LernPriorityQueue {
    public static void main(String[] args) {

        /*PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(62);
        pq.offer(32);
        pq.offer(12);
        pq.offer(22);
        pq.offer(52);
        pq.offer(42);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());*/


        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(12);
        pq.offer(42);
        pq.offer(62);
        pq.offer(32);
        pq.offer(22);
        pq.offer(52);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq.peek());
        System.out.println(pq);
        pq.poll();
        System.out.println("---------");

        System.out.println(pq);
        System.out.println(pq.peek());

    }
}
