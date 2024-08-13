package com.programs;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArray {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(6);
		lst.add(5);
		lst.add(8);
		lst.add(2);
		
		Integer[] arr = lst.toArray(new Integer[0]);
		int[] a = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			a[i] = arr[i];
		}
		
		for(int i: a) {
			System.out.println(i);
		}
		
		System.out.println(a.getClass().getName());
	}
}
