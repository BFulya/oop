package com.n11.java101;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        System.out.print("Enter r: ");
        int r = input.nextInt();

        int nFactorial = 1;
        int rFactorial = 1;
        int differenceFactorial = 1;

        for (int i = 1; i <= n; i++) {
            nFactorial *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFactorial *= i;
        }

        for (int i = 1; i <= (n - r); i++) {
            differenceFactorial *= i;
        }

        int combination = nFactorial / (rFactorial * differenceFactorial);

        System.out.println("C(" + n + "," + r + ") = " + combination);
    }
}