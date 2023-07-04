package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {
    @Test
    public void testIsOrderInWarehouse() throws OrderDoesntExistException{
        //given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new com.kodilla.exception.homework.Order("first"));
        //when
        Order isOrderInWarehouse = warehouse.getOrder("first");
        String orderName = isOrderInWarehouse.getNumber();
        //then
        assertEquals(orderName,"first");
    }
    @Test
    public void testIsOrderInWarehouse_withException(){
        //given
        Warehouse warehouse = new Warehouse();
        //when
        //then
        assertThrows(OrderDoesntExistException.class,()->warehouse.getOrder("first"));
    }
}