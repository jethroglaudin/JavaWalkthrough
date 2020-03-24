package school.management.system;

/*
* This class is responsible for keeping track
* of students fees, name, grade and fees paid.
* */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    // Constructor role is to create a new Student object by initialzing values

    /**
     * To create a new student by initiazing.
     * Fees for every student is $30,000.
     * fees paid initially is 0
     * @param id id for the student: unique
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int grade) {
        feesPaid = 0;
        feesTotal = 30_000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    // Not going to alter student's name, student's id.

    /**
     * Uded to update student's grade
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) {
       this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid
     * The school is going to receive the funds.
     *
     * @param fees the fees that the student pays
     */
    public void updateFeesPaid(int fees) {
        feesPaid+=fees;
    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student
     */
    public int getFeesTotal() {
        return feesTotal;
    }
}
