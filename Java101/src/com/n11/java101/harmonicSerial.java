package com.n11.java101;

import java.util.Scanner;

public class harmonicSerial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (N): ");
        int n = input.nextInt();

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += (1.0 / i);
        }

        System.out.println("Harmonic Series Sum: " + sum);
    }
}