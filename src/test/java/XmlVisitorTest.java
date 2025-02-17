import org.example.Student;
import org.example.XmlVisitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XmlVisitorTest {

    @Test
    public void validateJsonStudent() {
        Student student = new Student("Pedro", 23, "pedro@gmail.com");

        XmlVisitor visitor = new XmlVisitor();

        assertEquals("<student>\n<name>Pedro</name>\n<age>23</age>\n</student>", visitor.exportStudent(student));
    }

}
