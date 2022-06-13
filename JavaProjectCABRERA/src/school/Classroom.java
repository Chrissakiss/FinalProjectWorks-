package school;
import util.Displayable;
import java.util.*;

public class Classroom implements Displayable {
    private int roomNumber;
    Displayable<Teacher> teacher;
    ArrayList<Displayable<Student>> students = new ArrayList<>();

    public Classroom() {
    }
    public Classroom(int roomNumber, Displayable<Teacher> teacher, ArrayList<Displayable<Student>> students) {
        this.roomNumber = roomNumber;
        this.teacher = teacher;
        this.students = students;
    }


    public int getRoomNumber() { return roomNumber; }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Displayable getTeacher() { return teacher; }

    public ArrayList<Displayable<Student>> getStudents() {
        return students;
    }

    /*public ArrayList<Displayable<Student>> listStudents(ArrayList<Displayable<Student>> students, int roomNumber) {
        ArrayList<Displayable<Student>> kidsInClass = new ArrayList<>();
        for (Displayable<Student> student : students) {
            if
        }
    }*/

    public Displayable<Student> retrieveScholars(ArrayList<Displayable<Student>> students) {
        String fName = "Crissy";
        String lName = "Michelle";
        int studentId = 19;
        int finalGrade = 98;
        Student pupil = new Student(fName, lName, studentId, finalGrade);

        ArrayList<Displayable<Student>> pupils = new ArrayList<>();

        Student scholarly;
        do {
            scholarly = new Student();

            for (Displayable<Student> student : students) {
                pupil = (Student) student;
                fName = pupil.getStudentFirstName();
                lName = pupil.getStudentLastName();
                studentId = pupil.getStudentId();
                finalGrade = pupil.getFinalGrade();

                scholarly = pupil.getStudent(fName, lName, studentId, finalGrade);
                pupils.add(scholarly);
            }
        } while (students.listIterator().hasNext());

        Displayable<Student> listStudents = pupil;
        return pupil;
    }

    public String display() {
        return "Room Number: " + roomNumber;
    }
}
