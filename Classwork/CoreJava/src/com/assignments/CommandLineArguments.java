package com.assignments;

public class CommandLineArguments {
	    public static void main(String[] args) {
	        try {
	            if (args.length != 2) {
	                System.out.println("Please provide exactly two numbers as command line arguments.");
	                return;
	            }

	            int num1 = Integer.parseInt(args[0]);
	            int num2 = Integer.parseInt(args[1]);

	            int result = num1 / num2;
	            System.out.println("Result of division: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception in thread main java.lang.ArithmeticException: " + e.getMessage());
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input: " + e.getMessage());
	        }
	    }
}
