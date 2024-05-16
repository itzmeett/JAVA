package com.assignments;
import java.util.Scanner;

class Length{
	int letter=0, whiteSpace=0, digit=0, specialChar=0;
	Length(String str){
			
			
			for(int i=0; i<str.length(); i++) {
				char ch = str.charAt(i);
				
				if(Character.isLetter(ch)) {
					letter++;
				}else if(Character.isDigit(ch)) {
					digit++;
				}else if(Character.isWhitespace(ch)) {
					whiteSpace++;
				}else {
					specialChar++;
				}
		}
			System.out.println("Character = "+ letter);
			System.out.println("Digits = "+ digit);
			System.out.println("White Space = "+ whiteSpace);
			System.out.println("Other Characters = "+ specialChar);
			System.out.println("Total length of string is = "+(letter+digit+whiteSpace+specialChar));
	}
}

public class StringLength {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String string = scanner.nextLine();
		
		Length obj = new Length(string);
		
		scanner.close();
	}
}
