package com.nammaPayan.dto;

public class Orders {
    private String restaurantName;
    private String quantity;

    public Orders(String restaurantName, String quantity) {
        this.restaurantName = restaurantName;
        this.quantity = quantity;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}
