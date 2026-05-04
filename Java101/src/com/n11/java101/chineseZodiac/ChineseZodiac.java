package com.n11.java101.chineseZodiac;
import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] zodiac = {
                "Monkey", "Rooster", "Dog", "Pig",
                "Rat", "Ox", "Tiger", "Rabbit",
                "Dragon", "Snake", "Horse", "Sheep"
        };

        System.out.print("Enter your birth year: ");
        int year = input.nextInt();

        System.out.println("Your Chinese Zodiac: " + zodiac[year % 12]);

        input.close();
    }
}