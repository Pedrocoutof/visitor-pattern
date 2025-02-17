package org.example;

public class Student implements Person {
    private String name;
    private int age;
    private String email;

    public Student(String name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);
    }

    public void setEmail(String email) {
        if(email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        if(!email.contains("@")) {
            throw new IllegalArgumentException("Email must contain @");
        }
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        this.name = name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be negative or zero");
        }

        this.age = age;
    }

    @Override
    public String export(Visitor visitor) {
        return visitor.exportStudent(this);
    }

}