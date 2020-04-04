package com.jethro.generics;

public class GenericList <T> {
    // class can have paramaters as well. the T represents the type of value our class will take.
    private T[] items = (T[])new Object[10];
    private int count;

    public void add (T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
