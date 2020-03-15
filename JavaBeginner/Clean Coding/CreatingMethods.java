package com.jethro;

public class Main {

    public static void main(String[] args) {
//       greetUser("Jethro", "Glaudin");
//       greetUser("John", "Doe");
        String message = greetUser("Jethro", "Glaudin");
    }
    public static String greetUser(String firstName, String lastName) {
//        System.out.println("Hello " + firstName + " " + lastName);
        return "Hello " + firstName + " " + lastName;
        
    }
}
