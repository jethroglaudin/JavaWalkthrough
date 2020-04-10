package com.jethro.lambdas;

public class LambdasDemo {
    public static String prefix = "-";
    public static void show(){
//        greet(new ConsolePrinter());
        // Lambda expressions are essentially objects, but we can use them to represent anonymous functions
        greet(message -> System.out.println(prefix + message)); // Lambda Expression
//        Printer printer = message -> System.out.println(message); // Lambda expression as a variable

//        greet(new Printer() { // Anonymous Inner class. Class does not have a name but an implementation. We can achieve the same result with less code.
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });
    }
    public static void greet(Printer printer){
        printer.print("Hello World");
    }
}
