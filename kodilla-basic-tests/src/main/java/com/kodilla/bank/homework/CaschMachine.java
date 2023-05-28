package com.kodilla.bank.homework;

public class CaschMachine {
    private int[] transactions;
    private int size;
    public CaschMachine(){
        this.transactions = new int[0];
    }
    public void add(int transaction){
        if (transaction==0){return;}
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0 , newTab, 0, transactions.length);
        newTab[this.size-1] = transaction;
        this.transactions = newTab;
    }
    public int getBalance(){
        int sum = 0;
        if (this.transactions.length == 0){
            return 0;
        }
        for (int i = 0; i < this.transactions.length; i++){
            sum = sum + this.transactions[i];
        }
        return sum;
    }
    public int getNumberOfTransactions(){
        return this.size;
    }
    public int getNumberOfTransactionsPayment(){
        int meter = 0;
        if (this.transactions.length == 0){
            return 0;
        }
        for (int i = 0; i < this.transactions.length; i++){
            if(this.transactions[i] >= 0) meter++;
        }
        return meter;
    }
    public int getNumberOfTransactionsPaycheck(){
        int meter = 0;
        if (this.transactions.length == 0){
            return 0;
        }
        for (int i = 0; i < this.transactions.length; i++){
            if(this.transactions[i] <= 0) meter++;
        }
        return meter;
    }

    public int[] getTransactions(){
        return transactions;
    }
    public int getAverageTrasactionPayment(){
        int sum = 0;
        int meter = 0;
        if (this.transactions.length == 0){
            return 0;
        }
        for (int i = 0; i < this.transactions.length; i++){
            if(this.transactions[i] >= 0) {
                sum = sum + this.transactions[i];
                meter++;
            }
        }
        if (sum != 0 && meter !=0){return sum/meter;}
        else return 0;
    }
    public int getAverageTrasactionPaycheck(){
        int sum = 0;
        int meter = 0;
        if (this.transactions.length == 0){
            return 0;
        }
        for (int i = 0; i < this.transactions.length; i++){
            if(this.transactions[i] <= 0) {
                sum = sum + this.transactions[i];
                meter++;
            }
        }
        if (sum != 0 && meter !=0){return sum/meter;}
        else return 0;
    }
}
