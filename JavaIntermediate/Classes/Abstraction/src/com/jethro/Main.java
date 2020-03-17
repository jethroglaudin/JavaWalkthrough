package com.jethro;

public class Main {

    public static void main(String[] args) {
//        var browser = new Browser();
//        browser.navigate("espn");

        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}
