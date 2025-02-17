import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CsvVisitorTest {

    @Test
    public void validateCsvStudent() {
        Student student = new Student("Pedro", 23, "pedro@gmail.com");

        CsvVisitor visitor = new CsvVisitor();

        assertEquals("name,age,email,\n" + "Pedro,23,pedro@gmail.com\n", visitor.exportStudent(student));
    }

    @Test
    public void validateCsvWithEditedDelimeterStudent() {
        Student student = new Student("Pedro", 23, "pedro@gmail.com");

        CsvVisitor visitor = new CsvVisitor(';');

        assertEquals("name;age;email;\n" + "Pedro;23;pedro@gmail.com\n", visitor.exportStudent(student));
    }


}
