package com.jethro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("----Welcome to U-Manage----");
        System.out.println("Student Information System");
        Scanner scanner = new Scanner(System.in);

        while (true){
            var input = scanner.next().toLowerCase();
            System.out.println("Enter the Name of your school");

            if(input.equals("exit")){
                break;
            }

        }
    }
}
