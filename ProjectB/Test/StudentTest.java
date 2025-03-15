package ProjectB.Test;

import ProjectB.Student;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testStudentCreation() {
        Student student = new Student("100190217", "Javeria");
        assertEquals("100190217", student.getStudentID());
        assertEquals("Javeria", student.getName());
    }

    @Test
    public void testSetters() {
        Student student = new Student("100190217", "Javeria");
        student.setStudentID("100190218");
        student.setName("Alice");
        assertEquals("100190218", student.getStudentID());
        assertEquals("Alice", student.getName());
    }
}

