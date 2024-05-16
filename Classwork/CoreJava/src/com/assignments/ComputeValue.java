package com.assignments;
import java.util.Scanner;

public class ComputeValue {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a single number = ");
		int number = scanner.nextInt();
		
		String	n = Integer.toString(number);
		String nn = n+n;
		String nnn = n+n+n;
		
		int numNN = Integer.parseInt(nn);
		int numNNN = Integer.parseInt(nnn);
		
		int result = number + numNN + numNNN;
		
		System.out.println("Result of "+ number +" + "+ numNN +" + " + numNNN + " = "+ result);
		
	}
}
