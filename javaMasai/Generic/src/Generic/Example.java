package Generic;

public class Example {
    public static void main(String[] args) {
        Box box = new Box("water");
        Box box1 = new Box(12);
        System.out.println(box.getValue());
        System.out.println(box1.getValue());
    }
}
