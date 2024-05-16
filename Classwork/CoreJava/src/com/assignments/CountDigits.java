package com.assignments;
import java.util.Scanner;

class CountDigits {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			long num, count=0;
			
			System.out.println("Enter Number less than 10M = ");
			
			do {
				while(!sc.hasNextLong()) {
					System.out.println("Please enter a input as a Digit");
					sc.next();	
				}
				num = sc.nextLong();
				if(num<0 || num>=10000000L) {
					System.out.println("Please enter a positive and less than 10M number");
				}else {
					break;
				}
			}while(num>0 || num<=10000000L);
			
			long originalNum = num;
			while(num!=0) {
				num /= 10;
				count++;
			}
			
			if(originalNum==0) {
				count = 1;
			}
				System.out.println(originalNum + " number has "+ count + " digits");
				sc.close();
   }
		
}
