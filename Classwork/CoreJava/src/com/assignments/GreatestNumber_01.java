package com.assignments;
import java.util.Scanner;
class Maxnum{
	
	public void max() {
		
	float n1, n2, n3;
	
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Number-1 : ");
			n1 = sc.nextFloat();

			System.out.print("\nEnter Number-2 : ");
			n2 = sc.nextFloat();
			
			System.out.print("\nEnter Number-3 : ");
			n3 = sc.nextFloat();
		}
		if(n1>n2 || n1>n3) {
				System.out.print("\n"+ n1 +" is Greatest Number");
			}
			else if(n2>n1 || n2>n3) {
				System.out.print("\n"+ n2 + "is Greatest Number");
			}else if(n3>n1 || n3>n2) {
				System.out.print("\n"+ n3 + "is Greatest Number");
			}else {
				System.out.print("\nError");
			}	
		}
	}
public class GreatestNumber_01 {
	public static void main(String args[]) {
	
		Maxnum m = new Maxnum();
		m.max();
		}
	}

