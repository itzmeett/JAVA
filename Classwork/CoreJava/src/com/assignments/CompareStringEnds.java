package com.assignments;
import java.util.Scanner;

public class CompareStringEnds {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter String-1 = ");
		String str1 = scanner.nextLine();
		
		System.out.println("Enter String-2 = ");
		String str2 = scanner.nextLine();
		
		int str1len = str1.length();
		int str2len = str2.length();
		
		boolean result = str1.endsWith(str2);
		
		if(result==true) {			
			System.out.println("String1 and String2 are ends with same characters");
		}else {
			System.out.println("String1 and String2 are not match with same characters");
		}	
	}
}
