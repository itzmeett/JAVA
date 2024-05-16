package com.assignments;
import java.util.Scanner;
	
class checkLeapYear{
	checkLeapYear() {
		
		int yy;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a Year : ");
			yy = sc.nextInt();
		}
		if(yy%400 == 0 || (yy%4 == 0 && yy%100!=0)) {
			System.out.println(yy+" is a Leap Year");
		}else {
			System.out.println(yy +" is not a Leap Year");
		}
}

public class LeapYear {
	public static void main(String[] args) {
		checkLeapYear obj = new checkLeapYear();
		
		}
	}
}
