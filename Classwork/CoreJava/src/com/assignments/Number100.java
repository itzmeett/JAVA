package com.assignments;

public class Number100 {
	public static void main(String[] args) {
		int num=100, i;
		System.out.println("Divided by 5 : \n");
		for(i=1; i<num; i++) {
			if(i%5==0 && i%3 !=0) {
				System.out.println(i);
			}
		}
		
		System.out.println("\nDivided by 3 : \n");

		for(i=1; i<num; i++) {
			if(i%3 ==0 && i%5!=0) {
				System.out.println(i);
			}
		}
		System.out.println("\nDivided by 3 & 5: \n");
		
		for(i=1; i<num; i++) {
			if(i%3 ==0 && i%5==0) {
				System.out.println(i);
			}
		}
	}
}	
