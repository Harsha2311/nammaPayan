package com.nammaPayan.dto;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String phoneNumber;
    private String name;
    private String gender;
    private String pincode;
    private List<Orders> orderHistory;

    public User(String name, String gender, String phoneNumber, String pincode) {
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.pincode = pincode;
        this.orderHistory = new ArrayList<>();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public List<Orders> getOrderHistory() {
        return orderHistory;
    }

    public void addOrderHistory(Orders orderHistory) {
        this.orderHistory.add(orderHistory);
    }

}
