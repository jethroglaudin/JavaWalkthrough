package com.jethro.lambdas;

import java.util.List;

public class LambdasDemo {
    public static void show() {
        List<Integer> list = List.of(1, 2, 3);

        for (var item : list) // Imperative Programming (for if/else, switch/case) Instructions
            System.out.println(item);

        list.forEach(item -> System.out.println(item)); // Declarative Programming.
    }
//    public LambdasDemo(String message) {
//    }
//    public static void print (String message){}
//
//    public static void show(){
//        greet(LambdasDemo::print);
//        greet(LambdasDemo::new); // Method references through constructor.
        //Class/Object::method

//        greet(new ConsolePrinter());
        // Lambda expressions are essentially objects, but we can use them to represent anonymous functions
//        greet(message -> System.out.println(message)); // Lambda Expression
//        Printer printer = message -> System.out.println(message); // Lambda expression as a variable

//        greet(new Printer() { // Anonymous Inner class. Class does not have a name but an implementation. We can achieve the same result with less code.
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });
//    }
//    public static void greet(Printer printer){
//        printer.print("Hello World");
//    }
}
