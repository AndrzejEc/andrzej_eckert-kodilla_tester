package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Warehouse {
    List<Order> orders = new ArrayList<>();
    public void addOrder(Order order){
        orders.add(order);
    }
    public Order getOrder(String number) throws OrderDoesntExistException{
        //Order result;
        List<Order> ordersTemp = new ArrayList<>();
        ordersTemp = orders
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .collect(Collectors.toList());
        if (!(ordersTemp.isEmpty()))
            return ordersTemp.get(0);
        throw new OrderDoesntExistException();
    }
}
