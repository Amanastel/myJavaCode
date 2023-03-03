package Generic;

public class Example {
    public static void main(String[] args) {
        /*Box box = new Box("water");
        Box box1 = new Box(12);
        System.out.println(box.getValue());
        System.out.println(box1.getValue());*/

        Box<String> box = new Box<String>("Wow this is amazing");
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());

        Box<Integer> box1 = new Box<>(122);
        System.out.println(box1.getValue());
        System.out.println(box1.container.getClass().getName());

        box.perFormSomeTask();
        box1.perFormSomeTask();
    }
}
