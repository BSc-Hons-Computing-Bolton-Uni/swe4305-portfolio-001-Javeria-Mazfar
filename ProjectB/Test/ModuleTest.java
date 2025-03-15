package ProjectB.Test;

import ProjectB.Module;
import ProjectB.Student;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class ModuleTest {

    @Test
    public void testModuleCreation() {
        Module module = new Module("COM4301", "Maths For Computing");
        assertEquals("COM4301", module.getModuleCode());
        assertEquals("Maths For Computing", module.getModuleName());
    }

    @Test
    public void testAddOrUpdateStudentMark() {
        Module module = new Module("COM4301", "Maths For Computing");
        Student student = new Student("100190217", "Javeria");

        module.addOrUpdateStudentMark(student, 85);
        assertEquals(85, (int) module.getStudentMarks().get(student));

        module.addOrUpdateStudentMark(student, 90); // Update mark
        assertEquals(90, (int) module.getStudentMarks().get(student));
    }

    @Test
    public void testCalculateMean() {
        Module module = new Module("COM4301", "Maths For Computing");
        module.addOrUpdateStudentMark(new Student("100190217", "Javeria"), 90);
        module.addOrUpdateStudentMark(new Student("100190218", "Alice"), 80);

        assertEquals(85.0, module.calculateMean(), 0.01); // Allowing small precision errors
    }

    @Test
    public void testCalculateMinAndMax() {
        Module module = new Module("COM4301", "Maths For Computing");
        module.addOrUpdateStudentMark(new Student("100190217", "Javeria"), 90);
        module.addOrUpdateStudentMark(new Student("100190218", "Alice"), 80);
        module.addOrUpdateStudentMark(new Student("100190219", "Bob"), 70);

        assertEquals(70, module.calculateMin());
        assertEquals(90, module.calculateMax());
    }

    @Test
    public void testCalculateGradeProfile() {
        Module module = new Module("COM4301", "Maths For Computing");
        module.addOrUpdateStudentMark(new Student("100190217", "Javeria"), 90); // A
        module.addOrUpdateStudentMark(new Student("100190218", "Alice"), 75); // A
        module.addOrUpdateStudentMark(new Student("100190219", "Bob"), 45); // D

        Map<String, Integer> gradeProfile = module.calculateGradeProfile();
        assertEquals(2, (int) gradeProfile.get("A (First Class)"));
        assertEquals(1, (int) gradeProfile.get("D (Third Class)"));
    }
}

