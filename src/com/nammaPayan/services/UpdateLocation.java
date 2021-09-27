package com.nammaPayan.services;

import com.nammaPayan.Directory;
import com.nammaPayan.dto.Restaurant;

public class UpdateLocation implements Iserve{
    private static UpdateLocation updateLocation;
    private Directory directory;
    public static UpdateLocation getInstance() {
        if(updateLocation == null)
            updateLocation = new UpdateLocation();
        return updateLocation;
    }
    private UpdateLocation(){
        directory = Directory.getDirectory();
    }

    @Override
    public void execute(String[] commands) {
        Restaurant restaurant = directory.getRestaurant(commands[1]);
        if(restaurant == null) {
            System.out.println("Restaurant is not registered yet");
            return;
        }
        restaurant.addPincode(commands[2]);
        directory.addRestaurantByPinCode(commands[2], restaurant);
        System.out.println("Location updated successfully");
    }
}
