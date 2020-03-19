package com.jethro;

import java.text.NumberFormat;

public class MortgageReport {

    private static MortgageCalculator calculator;

    public static void printPaymentSchedule(String formattedMortgage, double Mortgage) {
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + formattedMortgage);
        System.out.println(" ");
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("------------------");
    }

    public static void paymentsLeft(int PRINCIPAL, float ANNUAL_INTEREST_RATE, byte years) {
//        printPaymentSchedule(formattedMortgage, Mortgage);
        calculator = new MortgageCalculator(PRINCIPAL, ANNUAL_INTEREST_RATE, years);
        short monthlyPeriods = (short) (years * Main.MONTHS_IN_YEAR);

        for (short month = 1; month <= monthlyPeriods; month++) {
            double remainingBalance = calculator.remainingBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(remainingBalance));
        }
    }

}
