package org.example;

public interface Person {
    String getName();
    void setName(String name);

    int getAge();
    void setAge(int age);

    String export(Visitor visitor);
}