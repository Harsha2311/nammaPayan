package com.nammaPayan.dto;

public class Reviews {
    private String restaurantName;
    private int rating;
    private String comments;

    public Reviews(String restaurantName, int rating, String comments) {
        this.restaurantName = restaurantName;
        this.rating = rating;
        this.comments = comments;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
