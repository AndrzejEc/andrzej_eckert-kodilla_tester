package com.kodilla.abstracts.homework;

 class Circle extends Shape {
    final double pi = 3.14;
    private double r;


    public Circle(double r){
        super();
        this.r=r;
    }

    //@Override

    public double calcSurface(){
        return pi * r * r;
    }



    //@Override
    public double calcCircuit(){
        return 2 + pi * r;
    }

}
