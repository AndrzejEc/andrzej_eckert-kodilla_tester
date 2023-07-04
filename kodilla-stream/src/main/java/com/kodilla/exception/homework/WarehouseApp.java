package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        String result;
        warehouse.addOrder(new Order("first order"));
        warehouse.addOrder(new Order("second order"));
        warehouse.addOrder(new Order("third order"));
        //order exist
        try {
            result = warehouse.getOrder("third order").getNumber();
            System.out.println("Found: " + result);
        } catch (OrderDoesntExistException e) {
            System.out.println("Order not found");
        } finally {
            System.out.println("Thanks for using Our Warehouse");
        }
        //order no exist
        try {
            result = warehouse.getOrder("fourth order").getNumber();
            System.out.println("Found: " + result);
        } catch (OrderDoesntExistException e) {
            System.out.println("Order not found");
        } finally {
            System.out.println("Thanks for using Our Warehouse");
        }
    }
}
