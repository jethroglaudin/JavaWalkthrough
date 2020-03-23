package com.jethro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var calculator = new TaxCalculator2020(100_000);
        var report = new TaxReport(calculator);
        report.show();

        report.setCalculator(new TaxCalculator2021()); // setter injection
        report.show();

    }
}
