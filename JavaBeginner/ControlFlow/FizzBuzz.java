package com.jethro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // If divisible by 5 print FIZZ
        // If divisible by 3 print BUZZ
        // If divisible by 5 & 3  print FIZZBUZZ
        // ELSE print the original input

        System.out.println("***FIZZBUZZ***");

        System.out.print("Number: ");

        final int Num = new Scanner(System.in).nextByte();
        final byte Fizz = 5;
        final byte Buzz = 3;

        if(Num % Buzz == 0 && Num % Fizz == 0)
            System.out.println("FizzBuzz");

        else if(Num % Buzz == 0)
            System.out.println("Buzz");

        else if(Num % Fizz == 0)
            System.out.println("Fizz");

        else
            System.out.println(Num);
    }
}
