package com.n11.java101;
import java.util.Scanner;

public class recursive {

    static void pattern(int current, int original, boolean decreasing) {
        System.out.print(current + " ");

        if (decreasing) {
            if (current <= 0) {
                pattern(current + 5, original, false);
            } else {
                pattern(current - 5, original, true);
            }
        } else {
            if (current == original) {
                return;
            }
            pattern(current + 5, original, false);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = input.nextInt();

        pattern(number, number, true);
    }
}