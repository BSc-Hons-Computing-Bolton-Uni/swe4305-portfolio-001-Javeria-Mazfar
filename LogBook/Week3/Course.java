package LogBook.Week3;

import LogBook.Week4.Module;
import java.util.ArrayList;

class Course {
    // Attributes
    String code;
    String name;
    ArrayList<Module> modules; // List to store modules


    // Constructor to initialize course code, name, and add module objects
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
        this.modules = new ArrayList<>();
        // Adding four module objects with custom names and codes
        modules.add(new Module("Maths For Computing", "SWE4301"));
        modules.add(new Module("CS Fundamentals", "SWE4302"));
        modules.add(new Module("Computing Infrastructure", "SWE4303"));
        modules.add(new Module("Databases", "SWE4304"));
    }

    // Print method
    void print() {
        System.out.println("Course Code: " + code);
        System.out.println("Course Name: " + name);
    }
}

