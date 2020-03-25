package com.jethro;

import java.text.NumberFormat;

public class Student {
    private int id;
    private String name;
    private short grade;
    private double feesPaid;
    private double feesTotal;

    public Student(int id, String name, short grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void payFees(int fees) {
        feesPaid += fees;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public short getGrade() {
        return grade;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " +name+
                " Total fees paid so far " + NumberFormat.getCurrencyInstance().format(feesPaid);
    }
}
