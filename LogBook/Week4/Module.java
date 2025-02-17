package LogBook.Week4;

public class Module {
    public String name;
    public String code;

    // Constructor to initialize module name and code
    public Module(String name, String code) {
        this.name = name;
        this.code = code;
    }

    // Enum for Grade
    public enum Grade {
        A("First Class"),
        B("Upper Second Class"),
        C("Lower Second Class"),
        D("Third Class"),
        F("Fail");

        private final String description;

        Grade(String description) {
            this.description = description;
        }

        // Method to get the description of the grade
        public String getDescription() {
            return description;
        }
    }

    // Method to convert a mark to a letter grade
    public Grade convertMarkToGrade(int mark) {
        if (mark >= 70 && mark <= 100) {
            return Grade.A;
        } else if (mark >= 60 && mark <= 69) {
            return Grade.B;
        } else if (mark >= 50 && mark <= 59) {
            return Grade.C;
        } else if (mark >= 40 && mark <= 49) {
            return Grade.D;
        } else {
            return Grade.F;
        }
    }
}




