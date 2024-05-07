package com.patterns;

public class SumOf10Square {
	public static void main(String args[]) {
		
		int i, sum=0;
		for(i=1; i<=10; i++) {
			sum += i*i;
		}
		System.out.println("Sum = "+ sum);
	}
	
}
