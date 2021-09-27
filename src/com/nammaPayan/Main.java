package com.nammaPayan;

import com.nammaPayan.services.ServiceFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("> ");
            String[] cmd = sc.nextLine().split(" ");
            ServiceFactory.getInstance().execute(cmd);
        }
    }
}
