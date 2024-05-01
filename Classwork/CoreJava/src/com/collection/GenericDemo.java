package com.collection;

import java.util.ArrayList;

public class GenericDemo {
	public static <E> void printArray(E inputArray[]) {
		for(E e:inputArray) {
			System.out.print(e + "");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		
		Integer intArray[] = {1,2,3,4,5};
		Double doubleArray[] = {1.1, 2.2, 3.3 , 4.4, 5.5};
		Character charArray[] = {'M', 'E', 'E', 'T'};
		String stringArray[] = {"Java", "Python", "PHP", "Automation"};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
		printArray(stringArray);
		
		ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		
		al1.add(10);
		al.add(al1);
		
	}
}
