package com.n11.java101;

import java.util.Scanner;

public class taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km;
        double perKm = 2.20;
        double startFee = 10;
        double total;

        System.out.print("Enter the distance in kilometers: ");
        km = input.nextDouble();

        total = startFee + (km * perKm);

        // Minimum fare check
        if (total < 20) {
            total = 20;
        }

        System.out.println("Total Taximeter Fare: " + total + " TL");
    }
}