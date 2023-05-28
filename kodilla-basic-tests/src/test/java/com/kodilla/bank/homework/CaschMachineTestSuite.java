package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaschMachineTestSuite {
    @Test
    public void shouldHaveZeroLenght(){
        CaschMachine caschMachine = new CaschMachine();
        int[] transactions = caschMachine.getTransactions();
        assertEquals(0,transactions.length);
    }
    @Test
    public void shouldAddTransactionToCaschMachine(){
        CaschMachine caschMachine = new CaschMachine();
        caschMachine.add(100);
        caschMachine.add(-100);

        int[] transactions = caschMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(100, transactions[0]);
        assertEquals(-100, transactions[1]);
    }
    @Test
    public void shouldDontAddZeroTransactionToCaschMachine(){
        CaschMachine caschMachine = new CaschMachine();
        caschMachine.add(0);

        int[] transactions = caschMachine.getTransactions();
        assertEquals(0, transactions.length);
    }
    @Test
    public void shouldShowBalance(){
        CaschMachine caschMachine = new CaschMachine();
        caschMachine.add(0);
        caschMachine.add(100);
        caschMachine.add(-100);
        caschMachine.add(50);
        int[] transactions = caschMachine.getTransactions();
        assertEquals(50, caschMachine.getBalance());
    }
    @Test
    public void shouldShowNumberTransactions(){
        CaschMachine caschMachine = new CaschMachine();
        caschMachine.add(0);
        caschMachine.add(100);
        caschMachine.add(-100);
        caschMachine.add(50);
        int[] transactions = caschMachine.getTransactions();
        assertEquals(3, caschMachine.getNumberOfTransactions());
    }
}
