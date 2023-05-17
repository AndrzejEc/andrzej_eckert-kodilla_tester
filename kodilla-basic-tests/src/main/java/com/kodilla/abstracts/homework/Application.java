package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Circle surface for r=2 : " +circle.calcSurface());
        System.out.println("Circle circuit for r=2 : " +circle.calcCircuit());

        Square square = new Square(2);
        System.out.println();
        System.out.println("Square surface for a=2 : " +square.calcSurface());
        System.out.println("Square circuit for a=2 : " +square.calcCircuit());

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println();
        System.out.println("Rectangle surface for a=2 b=3 : " +rectangle.calcSurface());
        System.out.println("Rectangle circuit for a=2 b=3 : " +rectangle.calcCircuit());


    }
}
