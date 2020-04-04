package com.jethro;

import com.jethro.exceptions.ExceptionsDemo;
import com.jethro.generics.GenericList;
import com.jethro.generics.List;
import com.jethro.generics.User;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        new GenericList<User>();


//        GenericList<Integer> numbers = new GenericList();
//        numbers.add(1); // java compilier will wrap this interger to the Interger class (boxing)
//        int number = numbers.get(0); // (unboxing)



//        var list = new GenericList<User>();
//        list.add(new User());
//        User user = list.get(0);


//        try { ... Lecture on exceptions
//            ExceptionsDemo.show();
//        } catch (Throwable e) {
//            System.out.println("An unexpected error occurred");
//        }
    }
}
