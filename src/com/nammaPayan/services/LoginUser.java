package com.nammaPayan.services;

import com.nammaPayan.Directory;
import com.nammaPayan.dto.User;

public class LoginUser implements Iserve {
    private static LoginUser loginUser;
    private static User currentUser;
    private Directory directory;
    public static LoginUser getInstance() {
        if(loginUser == null)
            loginUser = new LoginUser();
        return loginUser;
    }
    private LoginUser(){
        directory = Directory.getDirectory();
    }
    @Override
    public void execute(String[] commands) {
        currentUser = directory.getUser(commands[1]);
        if(currentUser == null)
            System.out.println("User does not exist, Please register first");
        else
            System.out.println("Logged in successfully");
    }
    public User getCurrentUser() {
        return currentUser;
    }
}
