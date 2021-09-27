package com.nammaPayan.services;

import com.nammaPayan.Directory;
import com.nammaPayan.dto.Restaurant;

import static java.lang.Integer.parseInt;

public class OrderNow implements Iserve{
    private static OrderNow orderNow;
    private Directory directory;
    public static OrderNow getInstance() {
        if(orderNow == null)
            orderNow = new OrderNow();
        return orderNow;
    }
    private OrderNow(){
        directory = Directory.getDirectory();
    }

    @Override
    public void execute(String[] commands) {
        Restaurant restaurant = directory.getRestaurant(commands[1]);
        if(restaurant.placeOrder(parseInt(commands[2])))
            System.out.println("Order Placed Successfully");
        else
            System.out.println("Order could not be placed because of low availability");
    }
}
