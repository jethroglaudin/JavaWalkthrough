package com.jethro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UI {
    public static void runUI() {
        System.out.println("----Welcome to U-Manage----");
        System.out.println("Student Information System");
        int teacherId = 1;
        int studentId = 1;
        boolean isFound = false;
        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name of your school \n");
        String nameOfSchool = scanner.nextLine().toUpperCase();
        System.out.println(nameOfSchool);
//        School school = new School(teacherList, studentList);
        System.out.println("Would you like to begin importing Teachers and Students? {yes} {no}");

        while (true) {
            if (scanner.nextLine().equals("no")) {
                break;
            }
            while (true) { // loop for adding teachers
                scanner.nextLine();
                System.out.print("Enter Teacher's name \n");
                var userInput = scanner.nextLine();
                if (userInput.equals("done")) {
                    break;
                }
                if (userInput.isBlank()) {
                    continue;
                }

                String teacherName = userInput;

                System.out.println("Enter Teacher's Salary \n");

                userInput = scanner.next();
                if (userInput.equals("quit")) {
                    break;
                }
                double teacherSalary = Double.parseDouble(userInput);

                Teacher newTeacher = new Teacher(teacherId, teacherName, teacherSalary);

                teacherId++;
                teacherList.add(newTeacher);
                System.out.println("You've successfully added " + teacherName + " to your teacher list. Would you like to add another");

                System.out.println("If you are done adding teachers to your school type 'done' or hit 'continue' add more \n");
                var whatNext = scanner.next();
                if (whatNext.equals("done")) {
                    break;
                }
            }
            while (true) { // loop for adding students
                System.out.println("Now let's add some students! \n");
                System.out.println("Enter Student's name");
                if (scanner.next().equals("quit")) break;
                else {
                    var userInput = scanner.nextLine();
                    if (userInput.equals("done")) break;

                    String studentName = userInput;
                    System.out.println("Enter Student's Grade");

                    userInput = scanner.next();
                    if (userInput.equals("quit")) break;
                    short grade = Short.parseShort(userInput);

                    Student newStudent = new Student(studentId, studentName, grade);
                    studentId++;
                    studentList.add(newStudent);
                    System.out.println("You've successfully added " + studentName + "to your student list. Would you like to add another{enter: add}" +
                            ", or are you finished {enter: done}");
                }
                System.out.println("If you are done adding students to your school type 'done' or hit continue to add more");
                var whatNext = scanner.next();
                if (whatNext.equals("done")) break;
            }

            while (true) {
                System.out.println("Enter what you would like to do next \n" +
                        "Get Teacher's Info: [1] \n" +
                        "Update Teacher's Salary: [2] \n" +
                        "Add Teacher's Salary: [3]\n");

                if (!scanner.hasNextInt()) {
                    continue;
                }
                var userInput = scanner.nextInt();
                if (userInput == 1) {
                    while (true) {
                        System.out.println("Enter Teacher's name you want to get info for");
                        var teacherName = scanner.next();
                        String[] teacherInfo;
                        for (Teacher teacher : teacherList) {
                            if (teacher.getName().contains(teacherName)) {
                                isFound = true;
                                teacherInfo = teacher.getInfo();
                                for (var i = 0; i < 1; i++) {
                                    System.out.println("ID: " + teacherInfo[0] + " " + "Name: " + teacherInfo[1] + " "
                                            + "Salary: " + teacherInfo[2] + " " + "Salary Earned: " + teacherInfo[3]);
                                }
                            }
                            else {
                                System.out.println("Could not find that teacher");
                                System.out.println("Enter 'redo' to try again or enter 'back' to return to teacher prompt");
                            }
                        }
                        if(!isFound)   {
                            if(scanner.next().equals("redo")) {
                                continue;
                            }
                        }
                        break;
                    }
                }
                else if(userInput == 2) {
                    while (true) {
                        System.out.println("Enter which teacher you want to update their salary");
                        var teacherName = scanner.next();
                        System.out.println("You've selected + " +teacherName);
                        System.out.println("Enter Their updated Salary");

                        var index = teacherList.stream().filter(obj -> obj.getName().equals(teacherName)).collect(Collectors.toList());
                        index.get(0).setSalary(50000);

                        break;
                    }

                }
                System.out.println("Enter {return} back to teacher prompt or move to student prompt enter {student}");
                if(!scanner.next().equals("return")){
                    break;
                }
            }
            break;
        }
    }
}
