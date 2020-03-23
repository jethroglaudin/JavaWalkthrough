package com.jethro;

public class TaxReport {
    private TaxCalculator2020 calculator;

    public TaxReport() {
        calculator = new TaxCalculator2020(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
