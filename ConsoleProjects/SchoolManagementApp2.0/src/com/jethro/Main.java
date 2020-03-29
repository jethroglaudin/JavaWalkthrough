package com.jethro;

import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("----Welcome to U-Manage----");
        System.out.println("Student Information System");
        int teacherId = 1;
        int studentId = 1;
        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name of your school \n");
        String nameOfSchool = scanner.nextLine().toUpperCase();
        System.out.println(nameOfSchool);
        System.out.println("Would you like to begin importing Teachers and Students? {yes} {no}");

        while (true) {
            if (scanner.nextLine().equals("no")) break;
            while (true) { // loop for adding teachers
                scanner.nextLine();
                System.out.print("Enter Teacher's name \n");
                var userInput = scanner.nextLine();
                if (userInput.equals("done")) break;
                if (userInput.isBlank()) continue;

                String teacherName = userInput;

                System.out.println("Enter Teacher's Salary \n");

                userInput = scanner.next();
                if (userInput.equals("quit")) break;
                double teacherSalary = Double.parseDouble(userInput);

                Teacher newTeacher = new Teacher(teacherId, teacherName, teacherSalary);

                teacherId++;
                teacherList.add(newTeacher);
                System.out.println("You've successfully added " + teacherName + " to your teacher list. Would you like to add another");

                System.out.println("If you are done adding teachers to your school type 'done' or hit 'continue' add more \n");
                var whatNext = scanner.next();
                if (whatNext.equals("done"))
                    break;
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
                    System.out.println("You've successfully added " + studentName + "vto your student list. Would you like to add another{enter: add}" +
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
                                teacherInfo = teacher.getInfo();
                                for (var i = 0; i < teacherInfo.length; i++) {
                                    System.out.println("ID: " + teacherInfo[0] + " " + "Name: " + teacherInfo[1] + " "
                                            + "Salary: " + teacherInfo[2] + " " + "Salary Earned: " + teacherInfo[3]);
                                }
                            } else {
                                System.out.println("Could not find that teacher");
                                System.out.println("Enter redo to try again or enter back to return to teacher prompt");
                            }
                            if(scanner.next().equals("redo")) {
                                continue;
                            }
                            break;
                        }
                        break;
                    }
                }
                break;
            }
            break;
        }
    }
}
