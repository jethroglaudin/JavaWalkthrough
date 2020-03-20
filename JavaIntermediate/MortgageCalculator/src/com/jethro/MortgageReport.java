package com.jethro;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
    }

    public void paymentsLeft() {
        for (double balance : calculator.getRemainingBalances())
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }

    public void printPaymentSchedule() {
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(calculator.calculateMortgage());
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
        System.out.println(" ");
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("------------------");
    }
}
