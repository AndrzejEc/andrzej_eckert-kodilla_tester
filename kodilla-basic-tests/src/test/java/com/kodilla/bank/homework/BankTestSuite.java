package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void shouldAddCaschMachineToBank() {
        Bank bank = new Bank("Test Bank");
        assertEquals(0, bank.getNumberOfCaschMachines());

        CaschMachine caschMachine1 = new CaschMachine();
        CaschMachine caschMachine2 = new CaschMachine();
        bank.addCaschmachine(caschMachine1);
        bank.addCaschmachine(caschMachine2);
        assertEquals(2, bank.getNumberOfCaschMachines());
    }

    @Test
    public void shouldGetTotalBalance() {
        Bank bank = new Bank("Test Bank");
        assertEquals(0, bank.getTotalBalance());

        CaschMachine caschMachine1 = new CaschMachine();
        caschMachine1.add(100);
        caschMachine1.add(100);

        CaschMachine caschMachine2 = new CaschMachine();
        caschMachine2.add(50);
        caschMachine2.add(-50);
        bank.addCaschmachine(caschMachine1);
        bank.addCaschmachine(caschMachine2);
        assertEquals(200, bank.getTotalBalance());
    }

    @Test
    public void shouldGetQuantityPaynament() {
        Bank bank = new Bank("Test Bank");
        assertEquals(0, bank.getTotalOfTransactionsPayment());

        CaschMachine caschMachine1 = new CaschMachine();
        caschMachine1.add(100);
        caschMachine1.add(100);
        CaschMachine caschMachine2 = new CaschMachine();
        caschMachine2.add(50);
        caschMachine2.add(150);
        caschMachine2.add(-50);
        bank.addCaschmachine(caschMachine1);
        bank.addCaschmachine(caschMachine2);
        assertEquals(4, bank.getTotalOfTransactionsPayment());

    }
    @Test
    public void shouldGetQuantityPaycheck() {
        Bank bank = new Bank("Test Bank");
        assertEquals(0, bank.getTotalOfTransactionsPaycheck());

        CaschMachine caschMachine1 = new CaschMachine();
        caschMachine1.add(100);
        caschMachine1.add(100);
        CaschMachine caschMachine2 = new CaschMachine();
        caschMachine2.add(50);
        caschMachine2.add(-50);
        bank.addCaschmachine(caschMachine1);
        bank.addCaschmachine(caschMachine2);
        assertEquals(1, bank.getTotalOfTransactionsPaycheck());
    }
    @Test
    public void shouldGetAveragePayment() {
        Bank bank = new Bank("Test Bank");
        assertEquals(0, bank.getAveragePayment());

        CaschMachine caschMachine1 = new CaschMachine();
        caschMachine1.add(100);
        caschMachine1.add(100);
        CaschMachine caschMachine2 = new CaschMachine();
        caschMachine2.add(50);
        caschMachine2.add(-50);
        bank.addCaschmachine(caschMachine1);
        bank.addCaschmachine(caschMachine2);
        assertEquals(83, bank.getAveragePayment());
    }
    @Test
    public void shouldGetAveragePacheck() {
        Bank bank = new Bank("Test Bank");
        assertEquals(0, bank.getAveragePaycheck());
        CaschMachine caschMachine1 = new CaschMachine();
        caschMachine1.add(100);
        caschMachine1.add(100);
        CaschMachine caschMachine2 = new CaschMachine();
        caschMachine2.add(50);
        caschMachine2.add(-50);
        bank.addCaschmachine(caschMachine1);
        bank.addCaschmachine(caschMachine2);
        assertEquals(-50, bank.getAveragePaycheck());
    }

}