package AbstractClass.com;
abstract class animal{
    animal(){
        System.out.println("all animal");
    }

    abstract void eat();

    abstract void sound();
}
class dog extends animal{
    dog(){
        super();
    }

    public void eat(){
        System.out.println("dog eat");
    }
    public void sound(){
        System.out.println("dog is barking");
    }

}

class lion extends animal{
    lion(){
        super();
    }
    void sound(){
        System.out.println("lion is roar");
    }
    void eat(){
        System.out.println("lion is eat");
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        System.out.println("hello");

        animal an = new dog();
        an.eat();
        an.sound();

        lion l = new lion();
        l.eat();
        l.sound();
    }
}
