package com.assignments;

class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) {
        if (age < 15 || age > 21) {
            System.out.println("Age should be between 15 and 21");
            return;
        }
        if (!isValidName(name)) {
            System.out.println("Name contains invalid characters");
            return;
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+");
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class AgeChecker {
    public static void main(String[] args) {
        Student student1 = new Student(1, "John Doe", 18, "Computer Science");
        if (student1 != null) {
            System.out.println("Student details:");
            System.out.println("Roll No: " + student1.getRollNo());
            System.out.println("Name: " + student1.getName());
            System.out.println("Age: " + student1.getAge());
            System.out.println("Course: " + student1.getCourse());
        }
        
        Student student2 = new Student(2, "Alice", 22, "Mathematics");
    }
}

