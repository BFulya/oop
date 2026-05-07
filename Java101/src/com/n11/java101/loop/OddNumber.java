package com.n11.java101.loop;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        double average = (double) sum / count;

        System.out.println("Average: " + average);
    }
}