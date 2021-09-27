package com.nammaPayan;

import com.nammaPayan.dto.Restaurant;
import com.nammaPayan.dto.User;

import java.util.*;
class PriceComparator implements Comparator<Restaurant>{

    @Override
    public int compare(Restaurant r1, Restaurant r2) {
        if(r2.getFoodPrice() == r1.getFoodPrice())
            return r1.getRestaurantName().compareTo(r2.getRestaurantName());
        return r2.getFoodPrice() - r1.getFoodPrice();
    }
}
public class Directory {
    private HashMap<String, User> userList;
    private HashMap<String, Restaurant> restaurantList;
    private HashMap<String, TreeSet<Restaurant>> restaurantListByPincode;
    private static Directory directory;

    public static Directory getDirectory() {
        if(directory == null)
            directory = new Directory();
        return directory;
    }
    private Directory(){
        this.userList = new HashMap<>();
        this.restaurantList = new HashMap<>();
        this.restaurantListByPincode = new HashMap<String, TreeSet<Restaurant>>();
    }
    public void addUser(User user){
        userList.put(user.getPhoneNumber(), user);
    }
    public void addRestaurant(Restaurant restaurant){
        restaurantList.put(restaurant.getRestaurantName(), restaurant);
    }
    public User getUser(String phoneNumber){
        return userList.getOrDefault(phoneNumber, null);
    }
    public Restaurant getRestaurant(String restaurantName){
        return restaurantList.getOrDefault(restaurantName, null);
    }
    public Set<Restaurant> getRestaurants(String pincode){
        return restaurantListByPincode.getOrDefault(pincode, null);
    }
    public void addRestaurantByPinCode(String pincode, Restaurant restaurant){
        if(!restaurantListByPincode.containsKey(pincode)){
            System.out.println("ulla");
            restaurantListByPincode.put(pincode, new TreeSet<Restaurant>(new PriceComparator()));
        }
        restaurantListByPincode.get(pincode).add(restaurant);
        System.out.println(restaurantListByPincode.get(pincode).size());
    }
}

