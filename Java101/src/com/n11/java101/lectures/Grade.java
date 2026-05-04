package com.n11.java101.lectures;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] subjects = {"Math", "Physics", "Turkish", "Chemistry", "Music"};
        int sum = 0, count = 0;

        for (String subject : subjects) {
            System.out.print("Enter " + subject + " grade: ");
            int grade = input.nextInt();

            if (grade >= 0 && grade <= 100) {
                sum += grade;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
            System.out.println(average >= 55 ? "You passed!" : "You failed!");
        } else {
            System.out.println("No valid grades entered.");
        }

        input.close();
    }
}
}