package com.n11.java101.fourAndFiveMultiple;

import java.util.Scanner;

public class FourAndFiveMultiple {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println("Powers of 4:");

        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }

        System.out.println("Powers of 5:");

        for (int i = 1; i <= number; i *= 5) {
            System.out.println(i);
        }
    }
}