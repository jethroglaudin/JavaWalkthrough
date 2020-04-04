package com.jethro.generics;

public class Utils {
    public static <T extends Comparable <T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }
}
