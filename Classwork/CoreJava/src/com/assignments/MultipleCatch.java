package com.assignments;

	public class MultipleCatch {
	    public static void main(String[] args) {
	        try {
	            int[] a = new int[5];
	            a[5] = 30 / 0; 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Array index out of bounds: " + e.getMessage());
	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic exception: " + e.getMessage());
	        }
	    }
	}


