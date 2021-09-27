package com.nammaPayan.services;

import com.nammaPayan.Directory;
import com.nammaPayan.dto.User;

public class RegisterUser implements Iserve{
    private static RegisterUser registerUser;
    private Directory directory;
    public static RegisterUser getInstance(){
        if(registerUser == null)
            registerUser = new RegisterUser();
        return registerUser;
    }
    private RegisterUser(){
        directory = Directory.getDirectory();
    }
    @Override
    public void execute(String[] commands) {
        User user = new User(commands[1], commands[2], commands[3], commands[4]);
        if(directory.getUser(commands[3]) == null) {
            directory.addUser(user);
            System.out.println("User registered successfully");
        }
        else
            System.out.println("User Already Exist");
    }
}
