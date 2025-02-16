package LogBook.Week3;

class Student {

    // Attributes
     int id;
    String name;
    Course course;
    int[] marks;  // Array to store four integer marks
    String[] modules;  // Array to store module names

    // Constructor
    public Student(int id, String name, String[] modules, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = new int[4];  // Initialize the marks array to store four integer mark
        this.modules = modules;
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

        // Print module details and corresponding marks
        if (modules != null && marks != null) {
            for (int i = 0; i < modules.length; i++) {
                System.out.println("Module: " + modules[i] + " - Mark: " + marks[i]);
            }
        } else {
            System.out.println("No modules or marks available.");
        }
    }

    // Enrol method
    public void enrol(Course course) {
        this.course = course;
    }
}

