package com.assignments;

import java.util.Scanner;

public class GradeCalculator {
    public static void calculateGrade(int marks) {
        char grade;

        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks < 90) {
            grade = 'B';
        } else if (marks >= 70 && marks < 80) {
            grade = 'C';
        } else if (marks >= 60 && marks < 70) {
            grade = 'D';
        } else if (marks >= 50 && marks < 60) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        calculateGrade(marks);

        scanner.close();
    }
}

