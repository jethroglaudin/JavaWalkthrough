package com.jethro.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
        try{
            var reader = new FileReader("file.txt");
            var value = reader.read();
            new SimpleDateFormat().parse("");
            System.out.println("File opened");
        } catch (IOException  | ParseException e) { // catching multiple exceptions
            System.out.println("Could not read data.");
        }

    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }

//    var reader = new FileReader("file.txt"); // example of checked exception Java compiler telling us to handle. Checked at compile time;

}
