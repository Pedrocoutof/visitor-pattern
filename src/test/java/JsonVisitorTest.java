import org.example.JsonVisitor;
import org.example.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonVisitorTest {

    @Test
    public void validateJsonStudent() {
        Student student = new Student("Pedro", 23, "pedro@gmail.com");

        JsonVisitor visitor = new JsonVisitor();

        assertEquals("{ name: Pedro,age: 23,email: pedro@gmail.com }", visitor.exportStudent(student));
    }

}
