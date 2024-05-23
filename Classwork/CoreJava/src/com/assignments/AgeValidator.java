package com.assignments;
import java.util.Scanner;

public class AgeValidator {

	    public static void validate(int age) throws ArithmeticException {
	        if (age < 18) {
	            throw new ArithmeticException("not valid");
	        } else {
	            System.out.println("Welcome to vote");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter your age: ");
	            int age = scanner.nextInt();

	            validate(age);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception in thread main java.lang.ArithmeticException: " + e.getMessage());
	        } finally {
	            scanner.close();
	        }
	    }
}
