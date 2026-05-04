package com.n11.java101.lectures;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        System.out.print("Enter Math grade: ");
        int math = input.nextInt();
        if (math >= 0 && math <= 100) {
            sum += math;
            count++;
        }

        System.out.print("Enter Physics grade: ");
        int physics = input.nextInt();
        if (physics >= 0 && physics <= 100) {
            sum += physics;
            count++;
        }

        System.out.print("Enter Turkish grade: ");
        int turkish = input.nextInt();
        if (turkish >= 0 && turkish <= 100) {
            sum += turkish;
            count++;
        }

        System.out.print("Enter Chemistry grade: ");
        int chemistry = input.nextInt();
        if (chemistry >= 0 && chemistry <= 100) {
            sum += chemistry;
            count++;
        }

        System.out.print("Enter Music grade: ");
        int music = input.nextInt();
        if (music >= 0 && music <= 100) {
            sum += music;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);

            if (average >= 55) {
                System.out.println("You passed!");
            } else {
                System.out.println("You failed!");
            }
        } else {
            System.out.println("No valid grades entered.");
        }

        input.close();
    }
}