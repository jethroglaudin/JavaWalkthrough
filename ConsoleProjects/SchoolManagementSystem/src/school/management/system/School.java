package school.management.system;

import java.util.List;

/**
 * Many teachers, many students
 * Implements teachers and students using an ArrayList
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created.
     * @param teachers list of teachers in the school.
     * @param students list of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }


    /**
     *
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school.
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Adds a teacher to the school
     * @param teacher
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *  Adds a student to the school
     * @return
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Adds the total money earned by the school.
     * @param moneyEarned money that is supposed to be added.
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * Update the money that is spent by the school
     * is the salary given by the school to its teachers.
     * @param moneySpent the money spent by the scool
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }
}
