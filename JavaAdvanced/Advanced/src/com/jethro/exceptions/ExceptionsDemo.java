package com.jethro.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
//        FileReader reader = null;
        try (
                var reader = new FileReader("file.txt");
                var writer = new FileWriter("...")
        ) { // try with resources statement
            var value = reader.read();
            new SimpleDateFormat().parse("");
            System.out.println("File opened");
        } catch (IOException  | ParseException e) { // catching multiple exceptions
            System.out.println("Could not read data.");
        }
//        finally { // we can release extra resources like file handlers & DB connections/ finally block always gets executed
//            if (reader != null) {
//                try {
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }

    public static void sayHello(String name) {
        System.out.println(name.toUpperCase());
    }

//    var reader = new FileReader("file.txt"); // example of checked exception Java compiler telling us to handle. Checked at compile time;

}
