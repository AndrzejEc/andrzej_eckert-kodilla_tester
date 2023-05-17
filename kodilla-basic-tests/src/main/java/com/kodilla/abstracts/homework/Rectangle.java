package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private int a;
    private int b;
    public Rectangle(int a, int b){
        super();
        this.a = a;
        this.b = b;
    }
    public double calcSurface(){
        return a * b;
    }
    public double calcCircuit(){
        return 2 * a + 2 * b;
    }
}
