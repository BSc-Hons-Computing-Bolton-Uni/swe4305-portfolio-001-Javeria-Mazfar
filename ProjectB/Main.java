package ProjectB;

import java.util.*;

public class Main {
    private static List<Student> students = new ArrayList<>();
    private static List<Module> modules = new ArrayList<>();

    public static void main(String[] args) {
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

    private static void manageStudents(Scanner scanner) {
        System.out.println("1. Add Student\n2. Edit Student\n3. Delete Student");
        int subChoice = getValidatedMenuChoice(scanner, "Enter your choice (1-3): ", 1, 3);
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
        }
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

        int mark = getValidatedMenuChoice(scanner, "Enter mark (0-100): ", 0, 100);
        module.addOrUpdateStudentMark(student, mark);
        System.out.println("Mark added successfully!");
    }

    private static void displayGrades() {
        for (Module module : modules) {
            System.out.println("\nModule: " + module.getModuleName());
            module.getStudentMarks().forEach((student, mark) -> {
                String grade = GradeCalculator.calculateGrade(mark);
                System.out.println("Student: " + student.getName() + " | Mark: " + mark + " | Grade: " + grade);
            });
        }
    }

    private static void viewStatistics() {
        for (Module module : modules) {
            System.out.println("\nModule: " + module.getModuleName());
            System.out.println("Mean Mark: " + module.calculateMean());
            System.out.println("Minimum Mark: " + module.calculateMin());
            System.out.println("Maximum Mark: " + module.calculateMax());
        }
    }

    private static void displayGradeProfile() {
        for (Module module : modules) {
            System.out.println("\nModule: " + module.getModuleName());
            Map<String, Integer> profile = module.calculateGradeProfile();
            int totalStudents = module.getStudentMarks().size();

            if (totalStudents == 0) {
                System.out.println("No student marks available.");
                continue;
            }

            profile.forEach((grade, count) -> {
                double percentage = (count / (double) totalStudents) * 100;
                System.out.printf("%s: %.2f%% (%d student(s))\n", grade, percentage, count);
            });
        }
    }

    private static Student findStudent(String id) {
        return students.stream()
                .filter(student -> student.getStudentID().equals(id))
                .findFirst()
                .orElse(null);
    }

    private static Module findModule(String code) {
        return modules.stream()
                .filter(module -> module.getModuleCode().equals(code))
                .findFirst()
                .orElse(null);
    }

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
}
