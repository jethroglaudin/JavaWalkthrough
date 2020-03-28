package com.jethro;

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
        System.out.println("Enter the Name of your school \n");
        String nameOfSchool = scanner.nextLine().toUpperCase();
        System.out.println(nameOfSchool);

        while (true){
            while (true){ // loop for adding teachers
                System.out.println("Enter teacher name");
                if(scanner.next().equals("quit")) break;
                else {
                    var userInput = scanner.nextLine();
                    if(userInput.equals("done")) break;

                    String teacherName = userInput;
                    System.out.println("Enter Teacher Salary");

                    userInput = scanner.next();
                    if(userInput.equals("quit")) break;
                    double teacherSalary = Double.parseDouble(userInput);

                    Teacher newTeacher = new Teacher(teacherId, teacherName, teacherSalary);
                    teacherId++;
                    teacherList.add(newTeacher);

                    System.out.println("You've successfully added " +teacherName+ "to your teacher list. Would you like to add another{enter: add}" +
                            ", or are you finished {enter: done}");
                }
                System.out.println("If you are done adding teachers to your school type 'done' or hit continue");
                var whatNext = scanner.next();
                if(whatNext.equals("done")) break;
            }
//            while(true) { // loop for adding students
//                System.out.println("Now let's add some students! \n ");
//
//              break;
//            }
            break;
        }
    }
}
