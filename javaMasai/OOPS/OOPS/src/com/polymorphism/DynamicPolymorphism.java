package com.polymorphism;


class Phone{
    public void showTime(){
        System.out.println("time is 4pm");
    }
    public void on(){
        System.out.println("turn on Phone...");
    }
}
class SamrtPhone extends Phone{
    public void music(){
        System.out.println("playing music...");
    }
    public void on(){
        System.out.println("turn on SmartPhone...");
    }

}
public class DynamicPolymorphism {

    public static void main(String[] args) {
        Phone obj = new SamrtPhone();
//        obj.music();
        obj.on();
    }
}
