package com.assignments;
import java.util.Scanner;

class Sum{
	public int sum = 0;
	Sum(){
		int i, num;
		Scanner sc = new Scanner(System.in);
			for(i=1; i<=5; i++)
			{
				System.out.println("Enter Number-"+i+" = ");
				num = sc.nextInt();
				sum+=num;
			}
		System.out.println("Sum of Numbers = "+ sum);
}
}
	
class Average extends Sum{
	int avg=0;
	
	public void result() {
		avg = sum/5;
		System.out.println("Average of sum is = "+ avg);		
	}
}

public class SumAverage {
	public static void main(String[] args) {
		Average obj2 = new Average();
		obj2.result();
//		Average obj3 = new Average();
//		obj3.result();
	}
}
