package com.patterns;

class NumberIncreasingPyramid {
	static void pattern(int n)
	{
		int row, column;
		for(row=1; row<=n; row++)
		{
			for(col=1; col<=row; col++)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(5);
	}
}
