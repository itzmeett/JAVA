package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {
	public static void main(String[] args) {
		String[] arr = {"2","5","3","9","12","1"};
		System.out.println("Array :");
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println(arr.getClass().getName());
		
		List<String> list = new ArrayList<>(Arrays.asList(arr));
		System.out.println("\nCollection :");
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println(list.getClass().getName());
	}
}
