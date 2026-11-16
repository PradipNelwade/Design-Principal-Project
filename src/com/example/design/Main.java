package com.example.design;

public class Main {
    public static void main(String[] args) {

        DeliveryService d=new DeliveryService();
        d.sendNotification();

        OrderService o = new OrderService();
        o.sendNotification();
    }
}
