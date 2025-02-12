package LogBook.Week3;

class Course {
    // Attributes
    String code;
    String name;


    // Constructor
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Print method
    void print() {
        System.out.println("Course Code: " + code);
        System.out.println("Course Name: " + name);
    }
}

