package com.jethro;

import com.jethro.exceptions.ExceptionsDemo;
import com.jethro.generics.List;
import com.jethro.generics.User;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        list.add(1);
        list.add("1");
        list.add(new User());


//        try { ... Lecture on exceptions
//            ExceptionsDemo.show();
//        } catch (Throwable e) {
//            System.out.println("An unexpected error occurred");
//        }
    }
}
