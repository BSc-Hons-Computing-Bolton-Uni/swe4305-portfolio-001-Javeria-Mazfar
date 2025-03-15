package ProjectB.Test;

import ProjectB.GradeCalculator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class GradeCalculatorTest {

    @Test
    public void testCalculateGrade() {
        assertEquals("A (First Class)", GradeCalculator.calculateGrade(90));
        assertEquals("B (Upper Second Class)", GradeCalculator.calculateGrade(65));
        assertEquals("C (Lower Second Class)", GradeCalculator.calculateGrade(55));
        assertEquals("D (Third Class)", GradeCalculator.calculateGrade(45));
        assertEquals("F (Fail)", GradeCalculator.calculateGrade(35));
    }
}

