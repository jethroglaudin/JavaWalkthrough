package school.management.system;

import java.util.List;

/**
 * Many teachers, many students
 * Implements teachers and students using an ArrayList
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

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
     * @param totalMoneyEarned money that is supposed to be added.
     */
    public void updateTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned += totalMoneyEarned;
    }

    /**
     * Update the money that is spent by the school
     * is the salary given by the school to its teachers.
     * @param moneySpent the money spent by the scool
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= totalMoneySpent;
    }
}
