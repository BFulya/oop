package com.n11.java101;
import java.util.Scanner;

public class RecursivePrime {

    static boolean isPrime(int number, int divisor) {
        // Base cases
        if (number < 2) {
            return false;
        }

        if (divisor == 1) {
            return true;
        }

        if (number % divisor == 0) {
            return false;
        }

        // Recursive step
        return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        if (isPrime(number, number / 2)) {
            System.out.println(number + " is PRIME!");
        } else {
            System.out.println(number + " is NOT PRIME!");
        }
    }
}