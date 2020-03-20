package com.jethro;

import java.text.NumberFormat;

public class MortgageCalculator {
    private final static byte MONTHS_IN_YEAR = 12;
    private final static byte PERCENT = 100;

    private final int PRINCIPAL;
    private final float ANNUAL_INTEREST_RATE;
    private byte years;

    public MortgageCalculator(int PRINCIPAL, float ANNUAL_INTEREST_RATE, byte years) {
        this.PRINCIPAL = PRINCIPAL;
        this.ANNUAL_INTEREST_RATE = ANNUAL_INTEREST_RATE;
        this.years = years;
    }

    public double remainingBalance (short paymentsMade) {
        float monthlyInterestRate = getMonthlyInterest();
        short monthlyPeriods = getMonthlyPeriods();

       double balance =  PRINCIPAL * (Math.pow(1 + monthlyInterestRate, monthlyPeriods) -
                Math.pow(1 + monthlyInterestRate, paymentsMade)) / (Math.pow((1 + monthlyInterestRate), monthlyPeriods) - 1);
        return balance;
    }


    public double calculateMortgage() {
        short monthlyPeriods = getMonthlyPeriods();
        float monthlyInterestRate = getMonthlyInterest();
        double MonthlyMortgagePayments = PRINCIPAL * (monthlyInterestRate * Math.pow((1 + monthlyInterestRate),
                monthlyPeriods) / (Math.pow(1 + monthlyInterestRate, monthlyPeriods) - 1));
        return MonthlyMortgagePayments;
    }

    public double[] getRemainingBalances(){
        var balances = new double[getMonthlyPeriods()];
        for (short month = 1; month <= balances.length; month++)
            balances[month - 1] = remainingBalance(month);
        return balances;
    }
    private short getMonthlyPeriods() {
        return (short) (years * MONTHS_IN_YEAR);
    }

    private float getMonthlyInterest() {
        return (ANNUAL_INTEREST_RATE / PERCENT) / MONTHS_IN_YEAR;
    }
}
