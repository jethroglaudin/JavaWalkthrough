package com.jethro;

public class Main {

    public static void main(String[] args) {
//       int temperature = 22;
//       Boolean isWarm = temperature > 20 && temperature < 30;
//       System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasGoodCredit || hasHighIncome) && !hasCriminalRecord;
    }
}