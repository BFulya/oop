package com.n11.java101;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Username: ");
            userName = input.nextLine();

            System.out.print("Password: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {

                System.out.println("Welcome to Kodluyoruz Bank!");

                do {
                    System.out.println("\n1- Deposit Money");
                    System.out.println("2- Withdraw Money");
                    System.out.println("3- Check Balance");
                    System.out.println("4- Exit");
                    System.out.print("Please select an operation: ");

                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Amount to deposit: ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            System.out.println("New Balance: " + balance);
                            break;

                        case 2:
                            System.out.print("Amount to withdraw: ");
                            int withdraw = input.nextInt();

                            if (withdraw > balance) {
                                System.out.println("Insufficient balance.");
                            } else {
                                balance -= withdraw;
                                System.out.println("New Balance: " + balance);
                            }
                            break;

                        case 3:
                            System.out.println("Current Balance: " + balance);
                            break;

                        case 4:
                            System.out.println("Thank you for using our ATM.");
                            break;

                        default:
                            System.out.println("Invalid selection. Please try again.");
                    }

                } while (select != 4);

                break;

            } else {
                right--;
                System.out.println("Incorrect username or password.");

                if (right == 0) {
                    System.out.println("Your account has been blocked. Please contact the bank.");
                } else {
                    System.out.println("Remaining attempts: " + right);
                }
            }
        }

        input.close();
    }
}