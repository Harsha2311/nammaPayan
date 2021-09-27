package com.nammaPayan.services;

import com.nammaPayan.Directory;
import com.nammaPayan.dto.Restaurant;

import java.util.Set;

public class ShowRestaurant implements Iserve{
    private static ShowRestaurant showRestaurant;
    private Directory directory;
    public static ShowRestaurant getInstance() {
        if(showRestaurant == null){
            showRestaurant = new ShowRestaurant();
        }
        return showRestaurant;
    }
    private ShowRestaurant() {
        directory = Directory.getDirectory();
    }

    @Override
    public void execute(String[] commands) {
        Set<Restaurant> restaurantList = directory.getRestaurants(commands[1]);
        if(restaurantList.isEmpty())
            System.out.println("No restaurants available at this time");
        else
        {
            for(Restaurant restaurant : restaurantList)
            {
                System.out.println(restaurant.getRestaurantName());
            }
        }
    }
}
