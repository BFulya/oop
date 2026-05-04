package com.n11.java101.ticketCalculator;

import java.util.Scanner;

public class FlightTicketCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distance = readDistance(input);
        int age = readAge(input);
        int tripType = readTripType(input);

        if (!isValid(distance, age, tripType)) {
            System.out.println("Invalid input data!");
            return;
        }

        double result = calculateTicketPrice(distance, age, tripType);

        System.out.println("Total Price = " + result + " TL");

        input.close();
    }

    // 🔹 INPUT METHODS
    public static double readDistance(Scanner input) {
        System.out.print("Enter distance (KM): ");
        return input.nextDouble();
    }

    public static int readAge(Scanner input) {
        System.out.print("Enter age: ");
        return input.nextInt();
    }

    public static int readTripType(Scanner input) {
        System.out.print("Enter trip type (1 => One Way, 2 => Round Trip): ");
        return input.nextInt();
    }

    // 🔹 VALIDATION
    public static boolean isValid(double distance, int age, int type) {
        return distance > 0 && age > 0 && (type == 1 || type == 2);
    }

    // 🔹 MAIN BUSINESS LOGIC
    public static double calculateTicketPrice(double distance, int age, int type) {

        double basePrice = calculateBasePrice(distance);
        double discountedPrice = applyAgeDiscount(basePrice, age);

        return applyTripTypeDiscount(discountedPrice, type);
    }

    // 🔹 BASE PRICE
    public static double calculateBasePrice(double distance) {
        return distance * 0.10;
    }

    // 🔹 AGE DISCOUNT
    public static double applyAgeDiscount(double price, int age) {

        if (age < 12) {
            return price * 0.50;
        }
        if (age <= 24) {
            return price * 0.90;
        }
        if (age > 65) {
            return price * 0.70;
        }

        return price;
    }

    // 🔹 TRIP TYPE DISCOUNT
    public static double applyTripTypeDiscount(double price, int type) {

        if (type == 2) {
            price = price * 0.80;
            return price * 2;
        }

        return price;
    }
}