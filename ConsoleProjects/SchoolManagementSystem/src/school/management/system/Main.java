package school.management.system;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);


        Student tamasha = new Student(1, "Tamasha", 4);
        Student remy = new Student(2, "Remy", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(remy);
        studentList.add(rabbi);


        School ghs = new School(teacherList, studentList);
        Teacher megan = new Teacher(4, "Megan", 900);
        ghs.addTeacher(megan);

        tamasha.payFees(5_000);
        remy.payFees(11_000);
        System.out.println("GHS has earned " + NumberFormat.getCurrencyInstance().format(ghs.getTotalMoneyEarned()));

        System.out.println("-----Making SCHOOL PAY SALARY------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + " and now has " +
                NumberFormat.getCurrencyInstance().format(ghs.getTotalMoneyEarned()));


        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName() + " and now has " +
                NumberFormat.getCurrencyInstance().format(ghs.getTotalMoneyEarned()));

        System.out.println(remy);
        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println(mellisa);
    }
}
