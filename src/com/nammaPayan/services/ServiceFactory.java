package com.nammaPayan.services;

import java.util.HashMap;
import java.util.Map;

public class ServiceFactory implements Iserve {

    private Map<String, Iserve> commandMap;
    private static ServiceFactory serviceFactory;
    public static synchronized ServiceFactory getInstance() {
        if (serviceFactory == null) {
            serviceFactory = new ServiceFactory();
        }
        return serviceFactory;
    }
    private ServiceFactory(){
        commandMap = new HashMap<>();
        commandMap.put("RegisterUser", RegisterUser.getInstance());
        commandMap.put("RegisterRestaurant", RegisterRestaurant.getInstance());
        commandMap.put("UpdateLocation", UpdateLocation.getInstance());
        commandMap.put("UpdateQuantity", UpdateQuantity.getInstance());
        commandMap.put("ShowRestaurant", ShowRestaurant.getInstance());
        commandMap.put("OrderNow", OrderNow.getInstance());
        commandMap.put("Login", LoginUser.getInstance());
    }
    @Override
    public void execute(String[] commands) {
        if(commandMap.containsKey(commands[0])) {
            if(LoginUser.getInstance().getCurrentUser() == null
                    && !commands[0].equalsIgnoreCase("RegisterUser")
                    && !commands[0].equalsIgnoreCase("Login"))
                System.out.println("Please Login");
            else
                commandMap.get(commands[0]).execute(commands);
        }
        else{
            System.out.println("Invalid command");
        }
    }
}
