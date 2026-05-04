package com.n11.java101.suggestAct;

public class SuggestAct {

    public static String suggestAct(int temp) {
        if (temp < 5) return "Ski";
        if (temp <= 15) return "Cinema";
        if (temp <= 25) return "Picnic";
        return "Swimming";
    }

    public static void main(String[] args) {
        int temp = 20;
        System.out.println(suggestAct(temp));
    }
}