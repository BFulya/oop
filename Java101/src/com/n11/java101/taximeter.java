package com.n11.java101;

import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double perKm = 2.20;
        double startFee = 10;

        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();

        double total = startFee + (km * perKm);

        // Ternary operator
        total = (total < 20) ? 20 : total;

        System.out.println("Total Taximeter Fare: " + total + " TL");
    }
}