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
        if (mark >= 70 && mark <= 100) {
            return "A First Class";
        } else if (mark >= 60 && mark <= 69) {
            return "B Upper Second Class";
        } else if (mark >= 50 && mark <= 59) {
            return "C Lower Second Class";
        } else if (mark >= 40 && mark <= 49) {
            return "D Third Class";
        } else {
            return "F Fail";
        }
    }
}


