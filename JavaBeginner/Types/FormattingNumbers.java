package com.jethro;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        // NumberFormat currency = NumberFormat.getCurrencyInstance(); // Factory method
        // creates a new object
        // NumberFormat percent = NumberFormat.getPercentInstance();

        // String result = percent.format(123456.891);
        // String result = percent.format(0.1);
        String result2 = NumberFormat.getPercentInstance().format(0.1);

        System.out.println(result2);
    }
}
