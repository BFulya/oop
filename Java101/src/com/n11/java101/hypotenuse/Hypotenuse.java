package com.n11.java101.hypotenuse;

import java.util.Scanner;


public class Hypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get all three sides once
        System.out.print("Enter side a: ");
        double a = input.nextDouble();

        System.out.print("Enter side b: ");
        double b = input.nextDouble();

        //Hypotenuse (assuming a and b are perpendicular)
        double hypotenuse = Math.sqrt((a * a) + (b * b));

        // Heron's formula for area
        double u = (a + b + hypotenuse) / 2;
        double area = Math.sqrt(u * (u - a) * (u - b) * (u - hypotenuse));

        System.out.println("Hypotenuse (calculated from a and b): " + hypotenuse);
        System.out.println("Triangle Area: " + area);
    }
}