import org.example.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StudentTest {

    @Test
    public void tryCreateStudentWithNullName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Student(null, 23, "pedro@gmail.com");
        });
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }

    @Test
    public void tryCreateStudentWithEmptyName() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Student("", 23, "pedro@gmail.com");
        });
        assertEquals("Name cannot be null or empty", exception.getMessage());
    }

    @Test
    public void tryCreateStudentWithNullEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Student("Pedro", 23, null);
        });
        assertEquals("Email cannot be null or empty", exception.getMessage());
    }

    @Test
    public void tryCreateStudentWithInvalidEmail() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Student("Pedro", 23, "pedro");
        });
        assertEquals("Email must contain @", exception.getMessage());
    }

    @Test
    public void tryCreateStudentWithInvalidAge() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Student("Pedro", 0, "pedro@gmail.com");
        });
        assertEquals("Age cannot be negative or zero", exception.getMessage());
    }

    @Test
    public void createValidStudent() {
        Student student = new Student("Pedro", 23, "pedro@gmail.com");

        assertEquals("Pedro", student.getName());
        assertEquals(23, student.getAge());
        assertEquals("pedro@gmail.com", student.getEmail());
    }
}
