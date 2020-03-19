package com.jethro;

public class MortgageCalculator {
    public static double calculateMortgage(
            int PRINCIPAL,
            float ANNUAL_INTEREST_RATE,
            byte years) {

        short monthlyPeriods = (short) (years * Main.MONTHS_IN_YEAR);
        float monthlyInterestRate = ((ANNUAL_INTEREST_RATE / Main.PERCENT) / Main.MONTHS_IN_YEAR);
        double MonthlyMortgagePayments = PRINCIPAL * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate),
                monthlyPeriods) / (Math.pow(1 + monthlyInterestRate, monthlyPeriods) - 1));
        return MonthlyMortgagePayments;
    }
}
