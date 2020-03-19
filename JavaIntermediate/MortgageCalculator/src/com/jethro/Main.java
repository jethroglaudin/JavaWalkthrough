package com.jethro;


import java.text.NumberFormat;

public class Main {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        System.out.println("************MORTGAGE CALCULATOR************");
        System.out.println("Calculate your monthly Mortgage Payments");

        final int PRINCIPAL = (int) Console.readNumber("Principal ($1K - $1M): ", 1_000, 1_000_000);
        final float ANNUAL_INTEREST_RATE = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
        final byte ANNUAL_PERIODS = (byte) Console.readNumber("Period (Years)", 1, 30);

        final double Mortgage = MortgageCalculator.calculateMortgage(PRINCIPAL, ANNUAL_INTEREST_RATE, ANNUAL_PERIODS);
        String formattedMortgage = NumberFormat.getCurrencyInstance().format(Mortgage);

        MortgageReport.paymentsLeft(PRINCIPAL, ANNUAL_INTEREST_RATE, ANNUAL_PERIODS, formattedMortgage, Mortgage);
    }

}
