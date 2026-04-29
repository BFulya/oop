package com.n11.java101.kdv;
import java.util.Scanner;

public class VatCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter price without VAT: ");
        double price = input.nextDouble();

        double vatRate;

        // VAT rate based on price
        if (price >= 0 && price <= 1000) {
            vatRate = 0.18;
        } else {
            vatRate = 0.08;
        }

        double vatAmount = price * vatRate;
        double priceWithVAT = price + vatAmount;

        System.out.println("Price without VAT: " + price);
        System.out.println("VAT Rate: " + (vatRate * 100) + "%");
        System.out.println("VAT Amount: " + vatAmount);
        System.out.println("Price with VAT: " + priceWithVAT);
    }
}