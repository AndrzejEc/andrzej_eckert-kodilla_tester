package com.kodilla.bank.homework;

public class Bank {
    private String name;
    private int size;
    private CaschMachine[] caschMachines;
    public Bank(String name){
        this.name = name;
        this.caschMachines=new CaschMachine[0];
    }
    public void addCaschmachine(CaschMachine newCaschmachine){
        this.size++;
        CaschMachine[] newTab = new CaschMachine[this.size];
        System.arraycopy(caschMachines,0, newTab,0, caschMachines.length);
        newTab[this.size-1] = newCaschmachine;
        this.caschMachines = newTab;
    }
    public int getNumberOfCaschMachines(){
        return this.size;
    }
    public int getTotalBalance(){
        int sum = 0;

        if (getNumberOfCaschMachines()==0) return 0;
        for (int i = 0; i < this.caschMachines.length; i++){
            for (int j = 0; j < this.caschMachines[i].getNumberOfTransactions(); j++) {
                sum = sum + caschMachines[i].getTransaction(j);
            }
        }
        return sum;
    }
    public int getTotalOfTransactionsPayment(){
        int count = 0;

        if (getNumberOfCaschMachines()==0) return 0;
        for (int i = 0; i < this.caschMachines.length; i++){
            for (int j = 0; j < this.caschMachines[i].getNumberOfTransactions(); j++) {
                if(this.caschMachines[i].getTransaction(j) >= 0) count++;
            }
        }
        return count;
    }

    public int getTotalOfTransactionsPaycheck(){
        int count = 0;

        if (getNumberOfCaschMachines()==0) return 0;
        for (int i = 0; i < this.caschMachines.length; i++){
            for (int j = 0; j < this.caschMachines[i].getNumberOfTransactions(); j++) {
                if(this.caschMachines[i].getTransaction(j) <= 0) count++;
            }
        }
        return count;

    }
    public int getAveragePayment() {
        int count = 0;
        int sum = 0;

        if (getNumberOfCaschMachines() == 0) return 0;
        for (int i = 0; i < this.caschMachines.length; i++){
            for (int j = 0; j < this.caschMachines[i].getNumberOfTransactions(); j++) {
                if(this.caschMachines[i].getTransaction(j) >= 0) {
                    count++;
                    sum = sum + this.caschMachines[i].getTransaction(j);
                }
            }
        }
        return sum/count;
    }
    public int getAveragePaycheck() {
        int count = 0;
        int sum = 0;

        if (getNumberOfCaschMachines() == 0) return 0;
        if (getNumberOfCaschMachines() == 0) return 0;
        for (int i = 0; i < this.caschMachines.length; i++){
            for (int j = 0; j < this.caschMachines[i].getNumberOfTransactions(); j++) {
                if(this.caschMachines[i].getTransaction(j) <= 0) {
                    count++;
                    sum = sum + this.caschMachines[i].getTransaction(j);
                }
            }
        }
        return sum/count;

    }
}
