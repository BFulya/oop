package com.n11.java101;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        while (number != 0) {
            sum += number % 10; // Get the last digit
            number /= 10;       // Remove the last digit
        }

        System.out.println("Sum of digits: " + sum);
    }
}