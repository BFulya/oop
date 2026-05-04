package com.n11.java101.greengrocer;

import java.util.HashMap;
import java.util.Scanner;

public class GreenGrocery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Product -> Price mapping
        HashMap<String, Double> products = new HashMap<>();
        products.put("Pear", 2.14);
        products.put("Apple", 3.67);
        products.put("Tomato", 1.11);
        products.put("Banana", 0.95);
        products.put("Eggplant", 5.00);

        double total = 0;

        // Loop through map
        for (String product : products.keySet()) {
            System.out.print(product + " (kg): ");
            double kg = input.nextDouble();

            total += kg * products.get(product);
        }

        System.out.printf("Total Amount: %.2f TL", total);
    }
}