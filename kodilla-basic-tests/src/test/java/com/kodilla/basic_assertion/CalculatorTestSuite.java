package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum(){
        Calculator calculator = new Calculator();
        int a= 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubstract(){
        Calculator calculator = new Calculator();
        int a= 5;
        int b = 8;
        double substractResult = calculator.substract(a, b);
        assertEquals(-03, substractResult, 0.1);
    }
    @Test
    public void testSquarePlus(){
        Calculator calculator = new Calculator();
        int a= 5;
        double squareResult = calculator.square(a);
        assertEquals(25, squareResult, 0.1);
    }
    @Test
    public void testSquareMinus(){
        Calculator calculator = new Calculator();
        int a= -4;
        double squareResult = calculator.square(a);
        assertEquals(16, squareResult, 0.1);
    }
    @Test
    public void testSquareZero(){
        Calculator calculator = new Calculator();
        int a= 0;
        double squareResult = calculator.square(a);
        assertEquals(0, squareResult, 0.1);
    }
}
