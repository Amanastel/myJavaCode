package anuj.com;

import java.util.ArrayDeque;

public class lernArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.offer(20);
        System.out.println(arrayDeque);
        arrayDeque.offerFirst(33);
        arrayDeque.offerFirst(43);
        arrayDeque.offerLast(54);
        System.out.println(arrayDeque);

        System.out.println("--------");

        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.peekFirst());
        System.out.println(arrayDeque.peekLast());

        System.out.println("--------");

        System.out.println(arrayDeque.poll());
        System.out.println("poll(): "+arrayDeque);

        System.out.println("--------");

        System.out.println(arrayDeque.pollFirst());
        System.out.println("pollFirst(): "+arrayDeque);

        System.out.println("--------");

        System.out.println(arrayDeque.pollLast());
        System.out.println("pollLast(): "+arrayDeque);
    }
}
