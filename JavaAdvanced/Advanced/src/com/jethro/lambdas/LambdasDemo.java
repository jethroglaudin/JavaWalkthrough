package com.jethro.lambdas;

public class LambdasDemo {
    public static void show(){
//        greet(new ConsolePrinter());
        greet(new Printer() { // Anonymous Inner class. Class does not have a name but an implementation. We can achieve the same result with less code.
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        });
    }
    public static void greet(Printer printer){
        printer.print("Hello World");
    }
}
