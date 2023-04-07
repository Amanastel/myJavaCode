import java.util.*;
package company;
import bank.*;
class Shape1 {
    String color;
}
class Triangle2 extends Shape1 {
    public void info(String color) {
        System.out.println(color);

    }
}
public class Inheritance {
    public static void main(String[] args) {
        // Triangle2 t1 = new Triangle2();
        // t1.color = "red";
        // t1.info(t1.color);
        bank.Account Account1 = new bank.Account();
        Account1.name =  "customar1";
    }
}

//multilevel Inheritance

class EeqiulateralTriangle2 extends Shape1{
    public void area (int l, int h) {
        System.out.println(1/2*l*h);
    }
}

class Circle1 extends Shape1 {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

