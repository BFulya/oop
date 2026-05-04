package com.n11.java101.ordering;

import java.util.Arrays;
import java.util.Scanner;

public class OrderingNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Sorted order: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);

        input.close();
    }
}