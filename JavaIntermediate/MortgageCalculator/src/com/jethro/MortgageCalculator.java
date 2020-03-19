package com.jethro;

public class MortgageCalculator {
    public final static byte MONTHS_IN_YEAR = 12;
    public final static byte PERCENT = 100;

    private final int PRINCIPAL;
    private final float ANNUAL_INTEREST_RATE;
    private byte years;

    public MortgageCalculator(int PRINCIPAL, float ANNUAL_INTEREST_RATE, byte years) {
        this.PRINCIPAL = PRINCIPAL;
        this.ANNUAL_INTEREST_RATE = ANNUAL_INTEREST_RATE;
        this.years = years;
    }

    public double remainingBalance (short paymentsMade) {
        float monthlyInterestRate = ((ANNUAL_INTEREST_RATE / PERCENT) / MONTHS_IN_YEAR);
        short monthlyPeriods = (short) (years * MONTHS_IN_YEAR);

       double balance =  PRINCIPAL * (Math.pow(1 + monthlyInterestRate, monthlyPeriods) -
                Math.pow(1 + monthlyInterestRate, paymentsMade)) / (Math.pow((1 + monthlyInterestRate), monthlyPeriods) - 1);
        return balance;
    }

    public double calculateMortgage() {
        short monthlyPeriods = (short) (years * MONTHS_IN_YEAR);
        float monthlyInterestRate = ((ANNUAL_INTEREST_RATE / PERCENT) / MONTHS_IN_YEAR);
        double MonthlyMortgagePayments = PRINCIPAL * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate),
                monthlyPeriods) / (Math.pow(1 + monthlyInterestRate, monthlyPeriods) - 1));
        return MonthlyMortgagePayments;
    }

    public short getYears() {
        return years;
    }
}
