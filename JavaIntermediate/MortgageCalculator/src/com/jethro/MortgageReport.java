package com.jethro;

import java.text.NumberFormat;

public class MortgageReport {
    public static void paymentsLeft(int PRINCIPAL, float ANNUAL_INTEREST_RATE, byte years, String formattedMortgage, double Mortgage) {
        printPaymentSchedule(formattedMortgage, Mortgage);

        float monthlyInterestRate = ((ANNUAL_INTEREST_RATE / Main.PERCENT) / Main.MONTHS_IN_YEAR);
        short monthlyPeriods = (short) (years * Main.MONTHS_IN_YEAR);
        int paymentsMade = 1;

        for (short month = 1; month <= monthlyPeriods; month++) {
            double remainingBalance = PRINCIPAL * (Math.pow(1 + monthlyInterestRate, monthlyPeriods) -
                    Math.pow(1 + monthlyInterestRate, paymentsMade)) / (Math.pow((1 + monthlyInterestRate), monthlyPeriods) - 1);
            paymentsMade++;
            System.out.println(NumberFormat.getCurrencyInstance().format(remainingBalance));
        }
    }

    public static void printPaymentSchedule(String formattedMortgage, double Mortgage) {
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + formattedMortgage);
        System.out.println(" ");
        System.out.println("Monthly Payments: " + Mortgage);
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("------------------");
    }
}
