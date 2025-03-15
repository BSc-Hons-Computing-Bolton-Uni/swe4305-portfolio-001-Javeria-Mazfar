package ProjectB.Test;

import ProjectB.Student;
import ProjectB.Module;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;

public class MainTest {

    @Test
    public void testFindStudent() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("100190217", "Javeria"));
        students.add(new Student("100190218", "Alice"));

        // Simulate findStudent logic
        Student student = students.stream()
                .filter(s -> s.getStudentID().equals("100190217"))
                .findFirst()
                .orElse(null);

        assertEquals("Javeria", student.getName());

        // Test non-existent student
        student = students.stream()
                .filter(s -> s.getStudentID().equals("999999999"))
                .findFirst()
                .orElse(null);

        assertNull(student);
    }

    @Test
    public void testFindModule() {
        List<Module> modules = new ArrayList<>();
        modules.add(new Module("COM4301", "Maths For Computing"));
        modules.add(new Module("COM4302", "CS Fundamentals"));

        // Simulate findModule logic
        Module module = modules.stream()
                .filter(m -> m.getModuleCode().equals("COM4301"))
                .findFirst()
                .orElse(null);

        assertEquals("Maths For Computing", module.getModuleName());

        // Test non-existent module
        module = modules.stream()
                .filter(m -> m.getModuleCode().equals("SWE9999"))
                .findFirst()
                .orElse(null);

        assertNull(module);
    }
}

