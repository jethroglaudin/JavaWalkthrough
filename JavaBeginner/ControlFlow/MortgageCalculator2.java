package com.jethro;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Principal:
        // Annual Interest Rate: /100 / 12 for monthly
        // Periods (Years)
        // Mortgage $472.81 m

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        final int PRINCIPAL_MIN = 1_000;
        final int PRINCIPAL_MAX = 1_000_000;
        final float ANNUAL_INTEREST_RATE_MIN = 0;
        final float ANNUAL_INTEREST_RATE_MAX = 30;
        final int PERIOD_MIN = 1;
        final int PERIOD_MAX = 30;

        System.out.println("************MORTGAGE CALCULATOR************");
        System.out.println("Calculate your monthly Mortgage Payments");


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            final int PRINCIPAL = scanner.nextInt();
            if (PRINCIPAL < PRINCIPAL_MIN || PRINCIPAL > PRINCIPAL_MAX) {
                System.out.println("Enter a number between 1,000 and 1,000,000");
                continue;
            }
            System.out.print("Annual Interest Rate: ");
            final float ANNUAL_INTEREST_RATE = scanner.nextFloat();
            if (ANNUAL_INTEREST_RATE < ANNUAL_INTEREST_RATE_MIN || ANNUAL_INTEREST_RATE > ANNUAL_INTEREST_RATE_MAX) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30");
                continue;
            }
            float monthlyInterestRate = ((ANNUAL_INTEREST_RATE / PERCENT) / MONTHS_IN_YEAR);
            System.out.print("Period (Years): ");
            final byte ANNUAL_PERIODS = scanner.nextByte();
            if (ANNUAL_PERIODS < PERIOD_MIN || ANNUAL_PERIODS > PERIOD_MAX) {
                System.out.println("Enter a value between 1 and 30");
                continue;
            }
            int monthlyPeriods = ANNUAL_PERIODS * MONTHS_IN_YEAR;

            final double MonthlyMortgagePayments = PRINCIPAL * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate),
                    monthlyPeriods) / (Math.pow(1 + monthlyInterestRate, monthlyPeriods) - 1));

            System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(MonthlyMortgagePayments));
            break;
        }
    }
}
