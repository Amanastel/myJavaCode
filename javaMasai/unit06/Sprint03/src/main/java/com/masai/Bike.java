package com.masai;

public class Bike implements Vehicle{
    public void ride(){
        System.out.println("bike started");
    }
    @Override
    public void go() {
        ride();
    }
}
