package org.example;

public class JsonVisitor implements Visitor{

    @Override
    public String exportStudent(Student student) {
        return "{ " +
                "name: " + student.getName() + "," +
                "age: " + student.getAge() + "," +
                "email: " + student.getEmail() +
                " }";
    }
}
