package com.jethro;

public class MortgageCalculator {

    private final int PRINCIPAL;
    private final float ANNUAL_INTEREST_RATE;
    private byte years;

    public MortgageCalculator(int PRINCIPAL, float ANNUAL_INTEREST_RATE, byte years) {
        this.PRINCIPAL = PRINCIPAL;
        this.ANNUAL_INTEREST_RATE = ANNUAL_INTEREST_RATE;
        this.years = years;
    }

    public double remainingBalance (short paymentsMade) {
        float monthlyInterestRate = ((ANNUAL_INTEREST_RATE / Main.PERCENT) / Main.MONTHS_IN_YEAR);
        short monthlyPeriods = (short) (years * Main.MONTHS_IN_YEAR);

       double balance =  PRINCIPAL * (Math.pow(1 + monthlyInterestRate, monthlyPeriods) -
                Math.pow(1 + monthlyInterestRate, paymentsMade)) / (Math.pow((1 + monthlyInterestRate), monthlyPeriods) - 1);
        return balance;
    }

    public double calculateMortgage() {
        short monthlyPeriods = (short) (years * Main.MONTHS_IN_YEAR);
        float monthlyInterestRate = ((ANNUAL_INTEREST_RATE / Main.PERCENT) / Main.MONTHS_IN_YEAR);
        double MonthlyMortgagePayments = PRINCIPAL * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate),
                monthlyPeriods) / (Math.pow(1 + monthlyInterestRate, monthlyPeriods) - 1));
        return MonthlyMortgagePayments;
    }
}
