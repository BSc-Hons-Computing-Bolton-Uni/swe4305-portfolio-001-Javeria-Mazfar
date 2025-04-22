package ProjectB;

import java.util.*;

public class Main {
    private static List<Student> students = new ArrayList<>();
    private static List<Module> modules = new ArrayList<>();

    public static void main(String[] args) {
        initializeSampleData();

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("\n--- Student Marks Management System ---");
                System.out.println("1. Manage Students");
                System.out.println("2. Manage Modules");
                System.out.println("3. Input Student Marks");
                System.out.println("4. Display Grades");
                System.out.println("5. View Module Statistics");
                System.out.println("6. Display Grade Profile");
                System.out.println("7. Exit");

                choice = getValidatedMenuChoice(scanner, "Enter your choice (1-7): ", 1, 7);

                switch (choice) {
                    case 1 -> manageStudents(scanner);
                    case 2 -> manageModules(scanner);
                    case 3 -> inputStudentMarks(scanner);
                    case 4 -> displayGrades();
                    case 5 -> viewStatistics();
                    case 6 -> displayGradeProfile();
                    case 7 -> System.out.println("Exiting the system. Goodbye!");
                }
            } while (choice != 7);
        }
    }

    // Correct implementation of `initializeSampleData`
    private static void initializeSampleData() {
// Adding 25 students with custom IDs and names
        students.add(new Student("100190217", "Javeria"));
        students.add(new Student("100190218", "Alice"));
        students.add(new Student("100190219", "Bob"));
        students.add(new Student("100190220", "Charlie"));
        students.add(new Student("100190221", "Diana"));
        students.add(new Student("100190222", "Ethan"));
        students.add(new Student("100190223", "Farah"));
        students.add(new Student("100190224", "George"));
        students.add(new Student("100190225", "Hannah"));
        students.add(new Student("100190226", "Ian"));
        students.add(new Student("100190227", "Jasmine"));
        students.add(new Student("100190228", "Kyle"));
        students.add(new Student("100190229", "Lila"));
        students.add(new Student("100190230", "Mason"));
        students.add(new Student("100190231", "Nina"));
        students.add(new Student("100190232", "Omar"));
        students.add(new Student("100190233", "Penny"));
        students.add(new Student("100190234", "Quinn"));
        students.add(new Student("100190235", "Rachel"));
        students.add(new Student("100190236", "Sam"));
        students.add(new Student("100190237", "Tina"));
        students.add(new Student("100190238", "Umar"));
        students.add(new Student("100190239", "Violet"));
        students.add(new Student("100190240", "William"));
        students.add(new Student("100190241", "Zara"));


// Adding 5 modules with custom names
        modules.add(new Module("COM4301", "Maths For Computing"));
        modules.add(new Module("COM4302", "CS Fundamentals"));
        modules.add(new Module("SWE4303", "Computing Infrastructure"));
        modules.add(new Module("SWE4304", "Databases"));
        modules.add(new Module("SWE4305", "OO Programming"));


        // Assigning random marks to students for each module
        Random random = new Random();
        for (Module module : modules) {
            for (Student student : students) {
                int mark = random.nextInt(101); // Random marks between 0 and 100
                module.addOrUpdateStudentMark(student, mark);
            }
        }

        System.out.println("Sample data initialized successfully!");
    }

    // Correct implementation of `getValidatedMenuChoice`
    private static int getValidatedMenuChoice(Scanner scanner, String prompt, int min, int max) {
        int choice;
        while (true) {
            try {
                System.out.print(prompt);
                choice = Integer.parseInt(scanner.nextLine().trim());
                if (choice >= min && choice <= max) {
                    return choice;
                }
                System.out.println("Error: Please enter a number between " + min + " and " + max + ".");
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
            }
        }
    }

    // Correct implementation of `manageStudents`
    private static void manageStudents(Scanner scanner) {
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Display All Students");

        int subChoice = getValidatedMenuChoice(scanner, "Enter your choice (1-4): ", 1, 4);
        scanner.nextLine(); // Consume newline

        switch (subChoice) {
            case 1 -> {
                System.out.print("Enter student ID: ");
                String id = scanner.nextLine();
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                students.add(new Student(id, name));
                System.out.println("Student added successfully!");
            }
            case 2 -> {
                System.out.print("Enter student ID to edit: ");
                String id = scanner.nextLine();
                Student student = findStudent(id);
                if (student != null) {
                    System.out.print("Enter new name: ");
                    student.setName(scanner.nextLine());
                    System.out.println("Student updated successfully!");
                } else {
                    System.out.println("Student not found!");
                }
            }
            case 3 -> {
                System.out.print("Enter student ID to delete: ");
                String id = scanner.nextLine();
                Student student = findStudent(id);
                if (student != null) {
                    students.remove(student);
                    System.out.println("Student removed successfully!");
                } else {
                    System.out.println("Student not found!");
                }
            }
            case 4 -> {
                System.out.println("Displaying all students:");
                students.forEach(student -> System.out.println(student.getStudentID() + ": " + student.getName()));
            }
        }
    }

    private static Student findStudent(String id) {
        return students.stream()
                .filter(student -> student.getStudentID().equals(id))
                .findFirst()
                .orElse(null);
    }

    private static void manageModules(Scanner scanner) {
        System.out.println("1. Add Module\n2. Edit Module\n3. Delete Module");
        int subChoice = getValidatedMenuChoice(scanner, "Enter your choice (1-3): ", 1, 3);
        scanner.nextLine(); // Consume newline

        switch (subChoice) {
            case 1 -> {
                System.out.print("Enter module code: ");
                String code = scanner.nextLine();
                System.out.print("Enter module name: ");
                String name = scanner.nextLine();
                modules.add(new Module(code, name));
                System.out.println("Module added successfully!");
            }
            case 2 -> {
                System.out.print("Enter module code to edit: ");
                String code = scanner.nextLine();
                Module module = findModule(code);
                if (module != null) {
                    System.out.print("Enter new module name: ");
                    module.setModuleName(scanner.nextLine());
                    System.out.println("Module updated successfully!");
                } else {
                    System.out.println("Module not found!");
                }
            }
            case 3 -> {
                System.out.print("Enter module code to delete: ");
                String code = scanner.nextLine();
                Module module = findModule(code);
                if (module != null) {
                    modules.remove(module);
                    System.out.println("Module removed successfully!");
                } else {
                    System.out.println("Module not found!");
                }
            }
        }
    }

    private static Module findModule(String code) {
        return modules.stream()
                .filter(module -> module.getModuleCode().equals(code))
                .findFirst()
                .orElse(null);
    }

    private static void inputStudentMarks(Scanner scanner) {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        Student student = findStudent(id);
        if (student == null) {
            System.out.println("Student not found!");
            return;
        }

        System.out.print("Enter module code: ");
        String code = scanner.nextLine();
        Module module = findModule(code);
        if (module == null) {
            System.out.println("Module not found!");
            return;
        }

        // Check if the student already has a mark for the module
        if (module.getStudentMarks().containsKey(student)) {
            System.out.println("This student already has a mark for this module.");
            System.out.println("Current mark: " + module.getStudentMarks().get(student));
            System.out.print("Do you want to update the mark? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                System.out.println("Mark not updated.");
                return;
            }
        }

        // Input and update the mark
        int mark = getValidatedMenuChoice(scanner, "Enter mark (0-100): ", 0, 100);
        module.addOrUpdateStudentMark(student, mark);
        System.out.println("Mark has been added/updated successfully!");
    }

    private static void displayGrades() {
        Scanner scanner = new Scanner(System.in); // Add Scanner for user input
        System.out.print("Enter module code: ");
        String moduleCode = scanner.nextLine(); // Prompt user for module code

        // Search for the module with the entered code
        Module selectedModule = modules.stream()
                .filter(module -> module.getModuleCode().equalsIgnoreCase(moduleCode))
                .findFirst()
                .orElse(null);

        // Check if the module exists
        if (selectedModule != null) {
            System.out.println("\nModule: " + selectedModule.getModuleName());
            selectedModule.getStudentMarks().forEach((student, mark) -> {
                String grade = GradeCalculator.calculateGrade(mark);
                System.out.println("Student: " + student.getName() + " | Mark: " + mark + " | Grade: " + grade);
            });
        } else {
            System.out.println("Module not found. Please ensure you entered the correct module code.");
        }
    }

    private static void viewStatistics() {
        System.out.println("\n--- Module Statistics ---");
        for (Module module : modules) {
            System.out.println("\nModule: " + module.getModuleName());
            if (module.getStudentMarks().isEmpty()) {
                System.out.println("No marks available for this module.");
                continue;
            }
            System.out.printf("Mean Mark: %.2f%n", module.calculateMean());
            System.out.println("Minimum Mark: " + module.calculateMin());
            System.out.println("Maximum Mark: " + module.calculateMax());
        }
    }

    private static void displayGradeProfile() {
        System.out.println("\n--- Grade Profile ---");
        for (Module module : modules) {
            System.out.println("\nModule: " + module.getModuleName());
            if (module.getStudentMarks().isEmpty()) {
                System.out.println("No marks available for this module.");
                continue;
            }
            Map<String, Integer> profile = module.calculateGradeProfile();
            int totalStudents = module.getStudentMarks().size();

            profile.forEach((grade, count) -> {
                double percentage = (count / (double) totalStudents) * 100;
                System.out.printf("%s: %.2f%% (%d student(s))%n", grade, percentage, count);
            });
        }
    }
}
