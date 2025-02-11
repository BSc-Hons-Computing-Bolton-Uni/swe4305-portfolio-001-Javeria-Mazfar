package LogBook.Week3;

class Student {

    // Attributes
     int id;
    String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Print method
    public void print() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }


    }
