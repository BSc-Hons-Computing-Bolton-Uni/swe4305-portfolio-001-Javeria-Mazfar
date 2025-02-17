package LogBook.Week3;

import java.util.Random;
import LogBook.Week4.Module;  // Import the Module class

class Student {

    // Attributes
    int id;
    String name;
    Course course;
    int[] marks;  // Array to store four integer marks
    String[] modules;  // Array to store module names
    Module[] moduleObjects;  // Array to store Module objects

    // Constructor
    public Student(int id, String name, String[] modules, int[] marks) {
        this.id = id;
        this.name = name;
        this.marks = new int[4];  // Initialize the marks array to store four integer marks
        this.modules = modules;

        // Create Module objects
        this.moduleObjects = new Module[4];
        for (int i = 0; i < modules.length; i++) {
            this.moduleObjects[i] = new Module(modules[i], "M" + (i + 1));
        }

        // Assign random marks to each module using the random number generator
        generateRandomMarks();
    }

    // Method to generate random marks between 0 and 100
    private void generateRandomMarks() {
        Random rand = new Random();
        for (int i = 0; i < marks.length; i++) {
            marks[i] = rand.nextInt(101);  // Generates a random number between 0 and 100 (inclusive)
        }
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

        // Print module details and corresponding marks and grades
        if (modules != null && marks != null && moduleObjects != null) {
            for (int i = 0; i < modules.length; i++) {
                Module.Grade grade = moduleObjects[i].convertMarkToGrade(marks[i]);
                System.out.println("Module: " + modules[i] + " - Mark: " + marks[i] + " - Grade: " + grade.getDescription());
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




