package com.n11.java101;

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Math grade: ");
        int math = input.nextInt();

        System.out.print("Physics grade: ");
        int physics = input.nextInt();

        System.out.print("Chemistry grade: ");
        int chemistry = input.nextInt();

        System.out.print("Turkish grade: ");
        int turkish = input.nextInt();

        System.out.print("History grade: ");
        int history = input.nextInt();

        System.out.print("Music grade: ");
        int music = input.nextInt();

        double average = (math + physics + chemistry + turkish + history + music) / 6.0;

        System.out.println("Average: " + average);

        String result = (average > 60) ? "Passed the class" : "Failed the class";

        System.out.println(result);
    }
}