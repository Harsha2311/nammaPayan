package com.nammaPayan.dto;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Comparable<Restaurant>{
    private String restaurantName;
    private String foodItemName;
    private int foodPrice;
    private int availability;
    private int rating;
    private List<Reviews> reviews;
    private List<String> pincodeList;

    public Restaurant(String restaurantName, String foodItemName, int foodPrice, int availability, List<String> pincodeList) {
        this.restaurantName = restaurantName;
        this.foodItemName = foodItemName;
        this.foodPrice = foodPrice;
        this.availability = availability;
        this.pincodeList = pincodeList;
    }

    public void addPincode(String pincodeString){
        this.pincodeList.add(pincodeString);
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public boolean placeOrder(int quantity) {
        if(quantity > this.availability)
            return false;
        else
            this.availability = this.availability - quantity;
        return true;
    }

    public boolean addQuantity(int quantity) {
        this.availability = this.availability + quantity;
        return true;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getFoodItemName() {
        return foodItemName;
    }

    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public List<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(List<Reviews> reviews) {
        this.reviews = reviews;
    }

    public List<String> getPincodeList() {
        return pincodeList;
    }

    public void setPincodeList(List<String> pincodeList) {
        this.pincodeList = pincodeList;
    }

    @Override
    public int compareTo(Restaurant o) {
        return restaurantName.compareTo(o.getRestaurantName());
    }
}
