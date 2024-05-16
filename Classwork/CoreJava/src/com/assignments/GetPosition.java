package com.assignments;
import java.util.Scanner;

public class GetPosition {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a String = ");
		String str = scanner.nextLine();
		
		System.out.println("Enter the position i give you character = ");
		int position = scanner.nextInt();
		
		int strLen = str.length();
		
		if(position > strLen) {
			System.out.println("Yourr string has a maximum " + strLen + "characters length");
		}else{
			char ch = str.charAt(position);
			System.out.println("At " +position+ "th character = "+ ch);
		}
	}

}
