package com.n11.java101.bmı;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your height (in meters): ");
        double height = input.nextDouble();

        System.out.print("Please enter your weight (in kg): ");
        double weight = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your Body Mass Index: " + bmi);
    }
}