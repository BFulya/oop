package com.n11.java101;

import java.util.Scanner;

public class JavaPatika {

    static void add() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;

        while (true) {
            System.out.print(i++ + ". number: ");
            number = scan.nextInt();
            if (number == 0) break;
            result += number;
        }

        System.out.println("Result: " + result);
    }

    static void subtract() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextInt();

            if (i == 1) {
                result = number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result: " + result);
    }

    static void multiply() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number: ");
            number = scan.nextInt();

            if (number == 1) break;
            if (number == 0) {
                result = 0;
                break;
            }

            result *= number;
        }

        System.out.println("Result: " + result);
    }

    static void divide() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number: ");
            number = scan.nextDouble();

            if (i == 1) {
                result = number;
                continue;
            }

            if (number == 0) {
                System.out.println("You cannot divide by 0!");
                continue;
            }

            result /= number;
        }

        System.out.println("Result: " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Base number: ");
        int base = scan.nextInt();

        System.out.print("Exponent: ");
        int exponent = scan.nextInt();

        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result: " + result);
    }

    // ✅ 7 - MOD
    static void mod() {
        Scanner scan = new Scanner(System.in);

        System.out.print("First number: ");
        int a = scan.nextInt();

        System.out.print("Second number: ");
        int b = scan.nextInt();

        if (b == 0) {
            System.out.println("Cannot take modulo by 0!");
            return;
        }

        int result = a % b;
        System.out.println("Result: " + result);
    }

    // ✅ 8 - RECTANGLE AREA & PERIMETER
    static void rectangle() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Short side: ");
        int shortSide = scan.nextInt();

        System.out.print("Long side: ");
        int longSide = scan.nextInt();

        int area = shortSide * longSide;
        int perimeter = 2 * (shortSide + longSide);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Power Calculation\n"
                + "6- Factorial Calculation\n"
                + "7- Modulo Operation\n"
                + "8- Rectangle Area & Perimeter\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Choose an operation: ");
            select = scan.nextInt();

            switch (select) {
                case 1: add(); break;
                case 2: subtract(); break;
                case 3: multiply(); break;
                case 4: divide(); break;
                case 5: power(); break;
                case 6: factorial(); break;
                case 7: mod(); break;
                case 8: rectangle(); break;
                case 0: break;
                default:
                    System.out.println("Invalid choice, try again.");
            }

        } while (select != 0);
    }
}