package com.assignments;

public class NestedCatch {
	    public static void main(String[] args) {
	        try {
	            try {
	                int[] a = new int[5];
	                a[5] = 30 / 0; 
	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Inner catch block: Array index out of bounds: " + e.getMessage());
	            }
	        } catch (ArithmeticException e) {
	            System.out.println("Outer catch block: Arithmetic exception: " + e.getMessage());
	        }
	    }
}
