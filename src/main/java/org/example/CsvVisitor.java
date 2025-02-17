package org.example;
import java.lang.reflect.Field;

public class CsvVisitor implements Visitor{

    char delimiter;

    public CsvVisitor() {
        this.delimiter = ',';
    }

    public CsvVisitor(char delimiter) {
        this.delimiter = delimiter;
    }

    @Override
    public String exportStudent(Student student) {
        String header = this.getHeader(student);

        String response = student.getName() + this.delimiter
                        + student.getAge() + this.delimiter
                        + student.getEmail() + "\n";

        return header + response;
    }

    private String getHeader(Object object) {
        Field[] attributes = this.getAttributes(object);
        StringBuilder header = new StringBuilder();

        for (Field field : attributes) {
            header.append(field.getName()).append(delimiter);
        }

        return header + "\n";
    }

    private Field[] getAttributes(Object object) {
        Class<?> objClass = object.getClass();
        return objClass.getDeclaredFields();
    }
}
