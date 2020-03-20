package com.jethro;

import java.text.NumberFormat;

public class MortgageReport {

    private final NumberFormat currency;
    private MortgageCalculator calculator;

    public MortgageReport(MortgageCalculator calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }
    public void printPaymentSchedule() {
        String mortgageFormatted = currency.format(calculator.calculateMortgage());
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
        System.out.println(" ");
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("------------------");
    }
    public void paymentsLeft() {
        for (double balance : calculator.getRemainingBalances())
            System.out.println(currency.format(balance));
    }

}
