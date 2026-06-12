package com.n11.java101;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

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