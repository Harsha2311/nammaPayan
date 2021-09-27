package com.nammaPayan.services;

import com.nammaPayan.Directory;
import com.nammaPayan.dto.Restaurant;

import static java.lang.Integer.parseInt;

public class UpdateQuantity implements Iserve{
    private static UpdateQuantity updateQuantity;
    private Directory directory;
    public static UpdateQuantity getInstance() {
        if(updateQuantity == null)
            updateQuantity = new UpdateQuantity();
        return updateQuantity;
    }
    private UpdateQuantity(){
        directory = Directory.getDirectory();
    }
    @Override
    public void execute(String[] commands) {
        Restaurant restaurant = directory.getRestaurant(commands[1]);
        if(restaurant == null) {
            System.out.println("Restaurant is not registered yet");
            return;
        }
        if(restaurant.addQuantity(parseInt(commands[2])))
            System.out.println("Quantity added successfully");
        else
            System.out.println("Unable to add quantity");
    }
}
