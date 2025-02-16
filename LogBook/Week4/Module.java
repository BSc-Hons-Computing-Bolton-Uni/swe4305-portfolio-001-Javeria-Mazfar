package LogBook.Week4;

public class Module {
    public String name;
    public String code;

    // Constructor to initialize module name and code
    public Module(String name, String code) {
        this.name = name;
        this.code = code;
    }

    // Method to convert a mark to a letter grade
    public String convertMarkToGrade(int mark) {
        if (mark >= 90) {
            return "A";
        } else if (mark >= 80) {
            return "B";
        } else if (mark >= 70) {
            return "C";
        } else if (mark >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}


