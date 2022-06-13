package school;
import util.Displayable;

public class Student extends Person implements Displayable {
    public int studentId;
    private int finalGrade;

    public Student() {
    }
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }
    public Student(String firstName, String lastName, int studentId, int finalGrade) {
        super(firstName, lastName);
        setStudentId(studentId);
        setFinalGrade(finalGrade);
    }


    public String getStudentFirstName() {
        String pupilName = this.getFirstName();
        return pupilName;
    }
    public String getStudentLastName() {
        String pupilSurName = this.getLastName();
        return pupilSurName;
    }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getFinalGrade() { return finalGrade; }
    public void setFinalGrade(int finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Student getStudent (String firstName, String lastName, int studentId, int finalGrade) {
        return new Student(firstName, lastName, studentId, finalGrade);
    }

    public String display() {
        return "Student ID: " + studentId + "  " + getFullName() + "    " +
                " Final Grade: " + finalGrade;
    }
    public String display(String firstName, String lastName, int studentId, int finalGrade) {
        return  "Student ID: " + studentId + "   " + firstName + " " + lastName +
                "      " + " Final Grade: " + finalGrade;
    }
}
