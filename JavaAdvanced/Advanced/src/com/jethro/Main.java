package com.jethro;

import com.jethro.exceptions.ExceptionsDemo;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            ExceptionsDemo.show();
        } catch (Throwable e) {
            System.out.println("An unexpected error occurred");
        }
    }
}
