package com.assignments;
import java.util.Scanner;

class checkChar{
	
	checkChar(){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a Charater : ");
	String str = sc.nextLine();
	int size = str.length();
	char chr = Character.toLowerCase(str.charAt(0));
	
	if(size > 1) {
		System.out.println("You Entered a more than one character, please enter a single character");
		return;
		}

		if(chr=='a' || chr=='e' || chr=='i' || chr=='o' || chr=='u') {
		System.out.println(str + " is a VOWEL");
		}
		else {
		System.out.println(str +" is a Consonant");
		}
	}
}

public class Vowelconsonent_02 {
	public static void main(String[] args) {
		checkChar obj = new checkChar();		
	}
}

