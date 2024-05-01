package com.core;
import java.io.*;
import java.util.*;
public class ExceptionHandling {
	public static void demo(){
		int x;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter X :");
			x = sc.nextInt();
			
			if(x>0) {
				System.out.println("Square of X = "+ (x*x));
			}
			else {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println("Please Enter Positive value only.");
			demo();
		}
	}
	
	public static void main(String args[]) {
		demo();
	}
}
