package com.n11.java101;
import java.util.Scanner;

public class maxMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will you enter: ");
        int n = input.nextInt();

        int max = 0, min = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Enter number: ");
            int number = input.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            }

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);

        input.close();
    }
}