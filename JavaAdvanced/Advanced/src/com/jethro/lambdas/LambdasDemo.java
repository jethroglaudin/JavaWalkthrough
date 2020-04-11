package com.jethro.lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdasDemo {
    public static void show() {
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        var predicateResult = isLongerThan5.test("sky");
        System.out.println(predicateResult);

        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";
        var result = replaceColon
                .andThen(addBraces)
                .apply("key:value");

        var result2 = addBraces
                .compose(replaceColon)
                .apply("key:value");
        System.out.println(result);
        System.out.println(result2);


//        Function<String, Integer> map = String::length; // Function interface. Takes paramater, <T,R> T represents type of argument R is type of the result.
//        var length = map.apply("Sky");
//        System.out.println(length);

//        Supplier<Double> getRandom = () -> Math.random(); // this function is not executed until explicitly called. value is not generated until we call for it.
//        var random = getRandom.get();
//        System.out.println(random);
//        List<Integer> list = List.of(1, 2, 3);
//        List<String> stringList = List.of("a", "b", "c");
//        Consumer<String> print = item -> System.out.println(item);
//        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//
//        stringList.forEach(print.andThen(printUpperCase).andThen(print)); // Chaining Consumers

//        for (var item : list) // Imperative Programming (for if/else, switch/case) Instructions
//            System.out.println(item);
//
//        list.forEach(item -> System.out.println(item)); // Declarative Programming.
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
