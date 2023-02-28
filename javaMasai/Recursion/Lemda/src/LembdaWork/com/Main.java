package LembdaWork.com;
import java.util.concurrent.Callable;
public class Main {
    public static void main(String[] args) {

        /*
        yInterImpl myInter = new MyInterImpl();
        myInter.sayHello();

        MyInter i = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("this is first anonymous class");
            }
        };

        i.sayHello();


        MyInter i2 = new MyInter(){

            @Override
            public void sayHello() {
                System.out.println("this is second anonymous class");
            }
        };
        i.sayHello();
        */

        MyInter i= ()-> System.out.println("this is first time i am using lambda");
        i.sayHello();

        MyInter i2 = ()->System.out.println("this is second time i am using lambda");
        i2.sayHello();

//        SumInter sumInter = (int a, int b)->{
//            return a+b;
//        };
        SumInter sumInter = (a,b)-> a+b; // this is a second way

        System.out.println(sumInter.sum(2,5));
        System.out.println(sumInter.sum(4,8));


        LengthInter lengthInter= str -> str.length();
        System.out.println(lengthInter.getLength("aman"));
        System.out.println("hello world");
    }
}
