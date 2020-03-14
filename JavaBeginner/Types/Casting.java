package com.jethro;

public class Main {

    public static void main(String[] args) {
        // Implicit casting or automatic conversion
        // byte > short > int > long > float > double
        double x = 1.1;
        int y = (int)x + 2; // Explicit casting
        System.out.println(y);

        // Explicit casting can only happen between compatible types.

        String s = "1";
        int num  = Integer.parseInt(s);
        System.out.println(num);
    }
}
