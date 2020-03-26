package com.jethro;

import java.text.NumberFormat;

/**
 * This class is responsible for keeping track of
 * teacher's id, name, salary
 */
public class Teacher {

    private int id;
    private String name;
    private double salary;
    private double salaryEarned;

    /**
     * Creates a new Teacher object
     *
     * @param id     id for teacher
     * @param name   name of the teacher
     * @param salary salary of the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return the id for the teacher
     */
    public int getId() {
        return id;
    }

    /**
     * @return name of the teacher
     */
    public String getName() {
        return name;
    }

    /**
     * @return the salary of the teacher.
     */
    public double getSalary() {
        return salary;
    }


    /**
     * Adds to salary
     *
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned = salary;
//        School.updateTotalMoneySpent(salary);
    }


    /**
     * Update the salary
     *
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher: " + name + " Total salary earned so far is  " + NumberFormat.getCurrencyInstance().format(salaryEarned);
    }
}