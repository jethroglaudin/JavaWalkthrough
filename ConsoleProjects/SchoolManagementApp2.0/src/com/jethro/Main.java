package com.jethro;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("----Welcome to U-Manage----");
        System.out.println("Student Information System");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name of your school");

        while (true){
            String nameOfSchool = scanner.nextLine().toUpperCase();
            if(scanner.nextLine().equals("quit")) break;
            System.out.println(nameOfSchool);

            while (true){
                System.out.println(" ");
                System.out.println("Enter teacher name");
                System.out.println("If you are done adding teachers to your school type 'done'");
                String teacherName = scanner.nextLine();
                if(scanner.nextLine().equals("quit")) break;
                System.out.println("Enter Teacher Salary");
                


            }


        }
    }
}
