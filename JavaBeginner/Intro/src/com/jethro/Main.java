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

        System.out.println("****************MORTGAGE CALCULATOR!!***************");
        System.out.println("Calculate your monthly Mortgage Payments");


        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        final int Principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        final float AnnualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = ((AnnualInterestRate / PERCENT) / MONTHS_IN_YEAR);

        System.out.print("Period (Years): ");
        final byte Annual_Periods = scanner.nextByte();
        int monthlyPeriods = Annual_Periods * MONTHS_IN_YEAR;
        final double MonthlyMortgagePayments = Principal * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate),
                monthlyPeriods) / (Math.pow(1 + monthlyInterestRate, monthlyPeriods) - 1));

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(MonthlyMortgagePayments));
    }
}
