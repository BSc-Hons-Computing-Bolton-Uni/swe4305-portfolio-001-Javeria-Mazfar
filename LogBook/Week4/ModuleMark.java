package LogBook.Week4;

import java.util.ArrayList;
import java.util.Random;

// Import the Module class
import LogBook.Week4.Module;

public class ModuleMark {
    // Attributes
    private Module module;
    private int mark;

    // Constructor to initialize module and mark
    public ModuleMark(Module module, int mark) {
        this.module = module;
        this.mark = mark;
    }

    // Getters for module and mark
    public Module getModule() {
        return module;
    }

    public int getMark() {
        return mark;
    }

    public static void main(String[] args) {
        // Create a list of students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", new String[]{"Maths For Computing", "CS Fundamentals", "Computing Infrastructure", "Databases"}));
        students.add(new Student(2, "Bob", new String[]{"Maths For Computing", "CS Fundamentals", "Computing Infrastructure", "Databases"}));
        students.add(new Student(3, "Charlie", new String[]{"Maths For Computing", "CS Fundamentals", "Computing Infrastructure", "Databases"}));
        students.add(new Student(4, "Diana", new String[]{"Maths For Computing", "CS Fundamentals", "Computing Infrastructure", "Databases"}));
        students.add(new Student(5, "Eve", new String[]{"Maths For Computing", "CS Fundamentals", "Computing Infrastructure", "Databases"}));

        // Generate marks randomly for each student's four modules
        Random rand = new Random();
        for (Student student : students) {
            for (int i = 0; i < student.moduleMarks.length; i++) {  // Use moduleMarks array
                int mark = rand.nextInt(101);  // Random mark between 0 and 100
                student.moduleMarks[i] = new ModuleMark(student.moduleMarks[i].getModule(), mark);
                System.out.println("Student: " + student.name + " - Module: " + student.moduleMarks[i].getModule().name + " - Mark: " + mark);
            }
        }
    }
}
