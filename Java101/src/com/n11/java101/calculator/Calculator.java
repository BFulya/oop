package com.n11.java101.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = input.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = input.nextInt();

        System.out.println("Choose an operation:");
        System.out.println("1 - Sum");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiply");
        System.out.println("4 - Division");

        int secim = input.nextInt();

        switch (secim) {

            case 1:
                System.out.println("Result: " + (a + b));
                break;

            case 2:
                System.out.println("Result: " + (a - b));
                break;

            case 3:
                System.out.println("Result: " + (a * b));
                break;

            case 4:
                if (b != 0)
                    System.out.println("Result: " + ((double)a / b));
                else
                    System.out.println("Error: Division by zero is not allowed");
                break;

            default:
                System.out.println("Invalid choose");
        }

        input.close();
    }
}