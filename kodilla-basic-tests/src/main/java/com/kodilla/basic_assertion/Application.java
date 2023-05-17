package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum dziala poprawnie dla liczb " + a + " i " +b);
        } else {
            System.out.println("Metoda sum nie dziala poprawnie dla liczb " + a + " i " +b);
        }

        a = 10;
        b = 6;
        int substractResult = calculator.substract(a,b);
        correct = ResultChecker.assertEquals(4, substractResult);
        if (correct) {
            System.out.println("Metoda substract dziala poprawnie dla liczb " + a + " i " +b);
        } else {
            System.out.println("Metoda substract nie dziala poprawnie dla liczb " + a + " i " +b);
        }

        a = 2;
        int squaretResult = calculator.square(a);
        correct = ResultChecker.assertEquals(4, squaretResult);
        if (correct) {
            System.out.println("Metoda square dziala poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda square nie dziala poprawnie dla liczby " + a);
        }

    }
}
