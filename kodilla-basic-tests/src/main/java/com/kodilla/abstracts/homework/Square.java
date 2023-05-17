package com.kodilla.abstracts.homework;

class Square extends Shape{
    private int a;

    public Square(int a){
        super();
        this.a = a;
    }
    public double calcSurface(){
        return a * a;
    }
    public double calcCircuit(){
        return 4 * a;
    }
}
