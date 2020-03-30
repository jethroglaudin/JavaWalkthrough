package com.jethro.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show() {
        try{
            var reader = new FileReader("file.txt");
            System.out.println("File opened");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }

//    var reader = new FileReader("file.txt"); // example of checked exception Java compiler telling us to handle. Checked at compile time;

}
