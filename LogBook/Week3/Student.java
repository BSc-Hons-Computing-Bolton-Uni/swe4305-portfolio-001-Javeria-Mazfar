package LogBook.Week3;

class Student {

    // Attributes
     int id;
    String name;
    Course course;
    int[] marks;  // Array to store four integer marks

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.marks = new int[4];  // Initialize the marks array to store four integer mark
    }

    // Print method
    public void print() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        if (course != null) {
            System.out.println("Enrolled Course Details:");
            course.print();
        } else {
            System.out.println("No course enrolled.");
        }
    }

    // Enrol method
    public void enrol(Course course) {
        this.course = course;
    }
}

