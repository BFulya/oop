package com.n11.java101;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pi = 3.14;

        // Get radius
        System.out.print("Enter the radius: ");
        double r = input.nextDouble();

        // Get central angle
        System.out.print("Enter the central angle (in degrees): ");
        double alpha = input.nextDouble();

        // Calculations
        double area = pi * r * r;
        double circumference = 2 * pi * r;
        double sectorArea = (pi * r * r * alpha) / 360;

        // Output
        System.out.println("Circle Area: " + area);
        System.out.println("Circle Circumference: " + circumference);
        System.out.println("Sector Area: " + sectorArea);
    }
}