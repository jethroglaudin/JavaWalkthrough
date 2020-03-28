package com.jethro;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("----Welcome to U-Manage----");
        System.out.println("Student Information System");
        int teacherId = 1;
        int studentId = 1;
        List <Teacher> teacherList = new ArrayList<>();
        List <Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name of your school");
        String nameOfSchool = scanner.nextLine().toUpperCase();
        System.out.println(nameOfSchool);


        while (true){
            while (true){ ;
                System.out.println("Enter teacher name");
                if(scanner.next().equals("quit")) break;
                else {
                    System.out.println("If you are done adding teachers to your school type 'done'");
                    String teacherName = scanner.nextLine();
                    if(scanner.next().equals("done")) break;
                    System.out.println("Enter Teacher Salary");
                    Double teacherSalary = scanner.nextDouble();
                    if(scanner.next().equals("quit")) break;

                    Teacher newTeacher = new Teacher(studentId, teacherName, teacherSalary);
                    teacherId++;
                    teacherList.add(newTeacher);

                    System.out.println("You've successfully added " +teacherName+ "to your teacher list. Would you like to add another{enter: add}" +
                            ", or are you finished {enter: done}");

                }
                var whatNext = scanner.next();
                if(whatNext.equals("done")) break;
            }
            break;
        }
    }
}
