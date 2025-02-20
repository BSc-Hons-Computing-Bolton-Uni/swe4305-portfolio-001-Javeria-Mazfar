package LogBook.Week3;

import java.util.Random;
import LogBook.Week4.Module;
import LogBook.Week4.ModuleMark;  // Import the ModuleMark class

class Student {

    // Attributes
    int id;
    String name;
    Course course;
    ModuleMark[] moduleMarks;  // Array to store ModuleMark objects

    // Constructor
    public Student(int id, String name, String[] modules) {
        this.id = id;
        this.name = name;
        this.moduleMarks = new ModuleMark[modules.length];  // Initialize the ModuleMark array

        // Create Module objects and assign random marks
        for (int i = 0; i < modules.length; i++) {
            Module module = new Module(modules[i], "M" + (i + 1));
            int mark = generateRandomMark();
            this.moduleMarks[i] = new ModuleMark(module, mark);
        }
    }

    // Method to generate random marks between 0 and 100
    private int generateRandomMark() {
        Random rand = new Random();
        return rand.nextInt(101);  // Generates a random number between 0 and 100 (inclusive)
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
        if (moduleMarks != null) {
            for (ModuleMark moduleMark : moduleMarks) {
                Module module = moduleMark.getModule();
                int mark = moduleMark.getMark();
                Module.Grade grade = module.convertMarkToGrade(mark);
                System.out.println("Module: " + module.name + " - Mark: " + mark + " - Grade: " + grade.getDescription());
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





