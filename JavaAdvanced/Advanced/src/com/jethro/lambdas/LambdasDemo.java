package com.jethro.lambdas;

public class LambdasDemo {
    public LambdasDemo(String message) {
    }
    public static void print (String message){}

    public static void show(){
        greet(LambdasDemo::print);
        greet(LambdasDemo::new); // Method references through constructor.
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
    }
    public static void greet(Printer printer){
        printer.print("Hello World");
    }
}
