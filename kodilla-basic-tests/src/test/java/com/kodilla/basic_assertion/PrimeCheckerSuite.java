package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerSuite {
    private static int count = 0;
    private PrimeChecker checker = new PrimeChecker();
    @Test
    public boolean isPrime(int a){
        if (a < 2){
            return false;
        }
        for (int i = 2; i < a; i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }
    public int getCount(){
        return count;
    }

    public void incrementCount(){
        this.count++;
    }

    //private PrimeChecker checker = new PrimeChecker();
    @Test
    public void ShouldReturnFalseWhenPassingNotPrimeNumber(){
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(14);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        assertFalse(result);
    }
    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(13);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(2);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(1);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(0);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(-6);
        checker.incrementCount();
        System.out.println("Count: " + checker.getCount());
        assertFalse(result);
    }
}
