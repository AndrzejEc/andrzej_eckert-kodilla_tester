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
        //return this.caschMachines.length;
        return this.size;
    }
    public int getTotalBalance(){
        int sum = 0;

        if (getNumberOfCaschMachines()==0) return 0;
        for (int i = 0; i < this.caschMachines.length; i++){
            sum = sum + caschMachines[i].getBalance();
        }
        return sum;
    }
    public int getTotalOfTransactionsPayment(){
        int sum = 0;

        if (getNumberOfCaschMachines()==0) return 0;
        for (int i = 0; i < this.caschMachines.length; i++){
            sum = sum + caschMachines[i].getNumberOfTransactionsPayment();
        }
        return sum;
    }

    public int getTotalOfTransactionsPaycheck(){
        int sum = 0;

        if (getNumberOfCaschMachines()==0) return 0;
        for (int i = 0; i < this.caschMachines.length; i++){
            sum = sum + caschMachines[i].getNumberOfTransactionsPaycheck();
        }
        return sum;
    }
    public int getAveragePament() {
        int sum = 0;

        if (getNumberOfCaschMachines() == 0) return 0;
        for (int i = 0; i < this.caschMachines.length; i++) {
            sum = sum + caschMachines[i].getAverageTrasactionPayment();
        }
        return sum/this.caschMachines.length;
        //return sum;
    }
    public int getAveragePaycheck() {
        int sum = 0;

        if (getNumberOfCaschMachines() == 0) return 0;
        for (int i = 0; i < this.caschMachines.length; i++) {
            sum = sum + caschMachines[i].getAverageTrasactionPaycheck();
        }
        return sum/this.caschMachines.length;
        //return sum;
    }
}
