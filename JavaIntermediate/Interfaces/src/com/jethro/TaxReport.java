package com.jethro;

public class TaxReport {
    private TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) { // constructor injection.
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
