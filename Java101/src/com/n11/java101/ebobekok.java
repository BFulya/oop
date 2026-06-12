package com.n11.java101;

import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = input.nextInt();

        System.out.print("Enter second number: ");
        int n2 = input.nextInt();

        int i = 1;
        int ebob = 1;

        // Finding GCD (EBOB)
        while (i <= n1 && i <= n2) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        // Finding LCM (EKOK)
        int ekok = (n1 * n2) / ebob;

        System.out.println("GCD (EBOB): " + ebob);
        System.out.println("LCM (EKOK): " + ekok);

        input.close();
    }
}