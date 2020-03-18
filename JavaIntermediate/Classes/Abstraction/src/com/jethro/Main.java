package com.jethro;

public class Main {

    public static void main(String[] args) {
//        var browser = new Browser();
//        browser.navigate("espn");

        new Employee(10_000);
        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage();
        System.out.println(wage);
    }
}
