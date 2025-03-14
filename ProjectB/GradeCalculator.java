package ProjectB;

// File: GradeCalculator.java

/**
 * Utility class for calculating grades based on marks.
 */
public class GradeCalculator {
    // Static method to calculate the grade based on the mark
    public static String calculateGrade(int mark) {
        if (mark >= 70) {
            return "A (First Class)";
        } else if (mark >= 60) {
            return "B (Upper Second Class)";
        } else if (mark >= 50) {
            return "C (Lower Second Class)";
        } else if (mark >= 40) {
            return "D (Third Class)";
        } else {
            return "F (Fail)";
        }
    }
}
