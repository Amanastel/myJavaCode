package anuj.com;

import java.util.Stack;

public class LernStack {
    public static void main(String[] args) {

        Stack<String> animal = new Stack<>();
        animal.push("dog");
        animal.push("elephant");
        animal.push("horse");
        animal.push("cat");

        System.out.println(animal.peek());
        System.out.println(animal.size());

        System.out.println("---------");

        animal.pop();
        System.out.println(animal.peek());
        System.out.println(animal);
        System.out.println(animal.size());
    }
}
