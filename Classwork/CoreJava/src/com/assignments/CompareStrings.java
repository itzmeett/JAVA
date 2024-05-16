package com.assignments;

import java.util.Scanner;

public class CompareStrings {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First string = ");
		String str1 = scanner.nextLine();
		
		System.out.println("Enter Second string = ");
		String str2 = scanner.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println(str1 + " & are " + str2 + " = TRUE");
		}else {
			System.out.println(str1 + " & are " + str2 + " = FALSE");
		}
	}
}
