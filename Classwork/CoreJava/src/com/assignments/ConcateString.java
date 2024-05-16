package com.assignments;
import java.util.Scanner;

public class ConcateString {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First string = ");
		String str1 = scanner.nextLine();
		
		System.out.println("Enter Second string = ");
		String str2 = scanner.nextLine();
		
//		String str3 = str1 + str2;
		System.out.println("Concatnation of two strings = "+ (str1 + " " + str2));
	}
}
