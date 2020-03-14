package com.jethro;


import java.awt.*;

public class Main {

    public static void main(String[] args) {
//    String message = new String("hello world");
        String message = "Hello World" + "!!";

        System.out.println(message.endsWith("!!"));
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("e"));
        System.out.println(message.replace("!", "*")); // returns new string
        System.out.println(message); // Strings are emmutable
        System.out.println(message.toLowerCase());
        




    }
}
