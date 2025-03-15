package ProjectB;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a university module in the system.
 */
public class Module {
    private String moduleCode; // Unique identifier for the module
    private String moduleName; // Module's name
    private Map<Student, Integer> studentMarks; // Map of students and their marks

    // Constructor
    public Module(String moduleCode, String moduleName) {
        this.moduleCode = moduleCode;
        this.moduleName = moduleName;
        this.studentMarks = new HashMap<>();
    }

    // Getters and setters
    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public Map<Student, Integer> getStudentMarks() {
        return studentMarks;
    }

    // Add or update a student's mark
    public void addOrUpdateStudentMark(Student student, int mark) {
        if (mark < 0 || mark > 100) {
            System.out.println("Error: Marks should be between 0 and 100.");
            return;
        }
        studentMarks.put(student, mark);
    }

    // Remove a student's mark
    public void removeStudentMark(Student student) {
        studentMarks.remove(student);
    }

    // Calculate mean, min, and max marks
    public double calculateMean() {
        return studentMarks.values().stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public int calculateMin() {
        return studentMarks.values().stream().mapToInt(Integer::intValue).min().orElse(0);
    }

    public int calculateMax() {
        return studentMarks.values().stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    // Generate a grade profile
    public Map<String, Integer> calculateGradeProfile() {
        Map<String, Integer> gradeProfile = new HashMap<>();
        studentMarks.values().forEach(mark -> {
            String grade = GradeCalculator.calculateGrade(mark);
            gradeProfile.put(grade, gradeProfile.getOrDefault(grade, 0) + 1);
        });
        return gradeProfile;
    }
}
