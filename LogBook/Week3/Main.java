package LogBook.Week3;

public class Main {
    public static void main(String[] args) {
        // Instantiate a Student object with ID and name
        Student student = new Student(100190217, "Javeria");

        // Instantiate a Course object with code and name
        Course course = new Course("(A1007-1001)", "BOLTON Computing");

        // Enrol the student in the course
        student.enrol(course);

    }
}


