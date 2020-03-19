package com.jethro;


import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        System.out.println("************MORTGAGE CALCULATOR************");
        System.out.println("Calculate your monthly Mortgage Payments");


        final int PRINCIPAL = (int) Console.readNumber("Principal ($1K - $1M): ", 1_000, 1_000_000);
        final float ANNUAL_INTEREST_RATE = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        final byte ANNUAL_PERIODS = (byte) Console.readNumber("Period (Years)", 1, 30);

        final double Mortgage = calculateMortgage(PRINCIPAL, ANNUAL_INTEREST_RATE, ANNUAL_PERIODS);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(Mortgage);

        MortgageReport.paymentsLeft(PRINCIPAL, ANNUAL_INTEREST_RATE, ANNUAL_PERIODS, formattedMortgage, Mortgage);
    }

    public static double calculateMortgage(
            int PRINCIPAL,
            float ANNUAL_INTEREST_RATE,
            byte years) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        short monthlyPeriods = (short) (years * MONTHS_IN_YEAR);
        float monthlyInterestRate = ((ANNUAL_INTEREST_RATE / PERCENT) / MONTHS_IN_YEAR);
        double MonthlyMortgagePayments = PRINCIPAL * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate),
                monthlyPeriods) / (Math.pow(1 + monthlyInterestRate, monthlyPeriods) - 1));
        return MonthlyMortgagePayments;
    }

}
