package com.n11.java101.login;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String correctPassword = "java123"; //current password

        System.out.print("Enter your password: ");
        String password = input.nextLine();

        if (password.equals(correctPassword)) {
            System.out.println("Login successful");
        } 
        else {
            System.out.println("Wrong password!");
            System.out.print("Do you want to reset your password? (yes/no): ");
            String choice = input.nextLine();

            if (choice.equalsIgnoreCase("yes")) {

                System.out.print("Enter new password: ");
                String newPassword = input.nextLine();

                if (newPassword.equals(correctPassword)) {
                    System.out.println("Password could not be created, please choose a different password.");
                } 
                else {
                    System.out.println("Password created successfully");
                    correctPassword = newPassword;
                }

            } 
            else {
                System.out.println("Password reset cancelled.");
            }
        }

        input.close();
    }
}