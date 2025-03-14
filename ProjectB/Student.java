package ProjectB;

// File: Student.java

/**
 * Represents a student in the system.
 */
public class Student {
    private String studentID; // Unique identifier for the student
    private String name; // Student's name

    // Constructor
    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    // Getters and setters
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
