package com.jethro;

import com.jethro.exceptions.ExceptionsDemo;
import com.jethro.generics.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        var instructors = new GenericList<Instructor>();
        var users = new GenericList<User>();
        Utils.printUsers(new GenericList<User>());


//        var max = Utils.max(new User(10), new User(20));
//        System.out.println(max);
//
//        Utils.print(1, 10);

//        var user1 = new User(10);
//        var user2 = new User(20);
//        if(user1.compareTo(user2) < 0)
//            System.out.println("user1 < user2");
//        else if (user1.compareTo(user2) == 0)
//            System.out.println("user1 == user2");
//        else
//            System.out.println("user1 > user2");

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
