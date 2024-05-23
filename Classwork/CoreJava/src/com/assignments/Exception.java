package com.assignments;

	import java.util.Scanner;

	public class Exception {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter two numbers: ");
	            int num1 = scanner.nextInt();
	            int num2 = scanner.nextInt();

	            int result = num1 / num2;

	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	            System.out.println("Division by zero is not allowed.");
	        } finally {
	            scanner.close();
	        }
	    }
	}
