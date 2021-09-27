package com.nammaPayan.services;

import com.nammaPayan.Directory;
import com.nammaPayan.dto.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

public class RegisterRestaurant implements Iserve{
    private static RegisterRestaurant registerRestaurant;
    private Directory directory;
    public static RegisterRestaurant getInstance(){
        if(registerRestaurant == null)
            registerRestaurant = new RegisterRestaurant();
        return registerRestaurant;
    }
    private RegisterRestaurant(){
        directory = Directory.getDirectory();
    }

    @Override
    public void execute(String[] commands) {
        String[] pincodeList = commands[2].split("/");
        if(directory.getRestaurant(commands[1]) != null)
        {
            System.out.println("Restaurant registered already");
            return;
        }
        Restaurant restaurant = new Restaurant(commands[1], commands[3], parseInt(commands[4]), parseInt(commands[5]), new ArrayList<>(Arrays.asList(pincodeList)));
        for(int i = 0; i < pincodeList.length; i++) {
            directory.addRestaurantByPinCode(pincodeList[i], restaurant);
        }
        directory.addRestaurant(restaurant);
        System.out.println("Restaurant registered successfully");
    }
}
