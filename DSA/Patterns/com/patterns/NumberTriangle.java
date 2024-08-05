package com.patterns;

class Temp{
	public static int pattern(int n)
	{
	int row, col, space;
		for(row=1; row<=n; row++);
		{
			for(space=1; space<=n-1; space++)
			{
				System.out.print(" ");
			}
			
			for(col=1; col<=i; col++)
			{
				System.out.println(col);
			}
			System.out.println();
		}
	}	
}

public class NumberTriangle {
	
	public static void main(String[] args) {
		pattern(5);
	}
}
