package com.assignments;
import java.util.Scanner;

public class AsciiValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a character = ");
		char ch = scanner.next().charAt(0);
		
		int ascci = (int)ch;
		
		System.out.println("Ascci value of charater \""+ ch + "\" = " + ascci);
				
	}
}
