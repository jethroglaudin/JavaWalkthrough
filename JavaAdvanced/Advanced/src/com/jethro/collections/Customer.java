package com.jethro.collections;

public class Customer implements Comparable<Customer> {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer other) {
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
