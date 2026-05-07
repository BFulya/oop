package com.n11.java101.foursmultiple;

import java.util.Scanner;

public class FoursLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;

        do {
            System.out.print("Enter a number: ");
            number = input.nextInt();

            // Check if the number is even and a multiple of 4
            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }

        } while (number % 2 == 0); // Continue until an odd number is entered

        System.out.println("Sum of even numbers that are multiples of 4: " + sum);
    }
}