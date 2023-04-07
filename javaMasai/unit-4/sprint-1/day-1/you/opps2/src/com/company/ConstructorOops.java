package com.company;
class Pen {
    String name;
    String type;
    String xyz;

    public void write() {
        System.out.println("likhna");
    }
    public void xyz() {
        System.out.println(this.xyz);
    }

}
public class ConstructorOops {
    public static void main(String[] args) {
        Pen newPen = new Pen();
        newPen.name = "s1";
        newPen.type = "red";
        newPen.xyz = "kuc bhi";
       // System.out.println(newPen.name);
       // newPen.write();
       // newPen.xyz();

        Pen pen2 = new Pen();
        pen2.type = "laal";
        pen2.xyz = "gel wala pen hai ye";

        pen2.xyz();

        class Man {
            String name;
            String papa;
            int age;


            public void aman() {
                System.out.println("aman " + this.name);
            }
            public void AmanKePapaKeBareMe() {
                System.out.println("aman " + this.papa);

            }
        }
        Man aadmi = new Man();
        aadmi.name = "aman";
        aadmi.papa = "jayhind";
        aadmi.age = 23;
        aadmi.aman();
        aadmi.AmanKePapaKeBareMe();

        pen2.xyz();
    }
}

