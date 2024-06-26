package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistDemo {
	public static void main(String args[]) {
		ArrayList a1 = new ArrayList ();
		
		a1.add(10);
		a1.add(8.40);
		a1.add("Meet");
		a1.add(true);
		a1.add(null);
		a1.add(10);
		
		System.out.println(a1);
		System.out.println(a1.get(2));
		System.out.println(a1.indexOf('M'));
		System.out.println(a1.lastIndexOf(10));
		
		System.out.println("-----------------Iterator-----------------");
		Iterator itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----------------List Iterator-----------------");
		ListIterator litr = a1.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(litr.next() + " TOPS");
		}
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("-----------------List Iterator Reverse-----------------");

		while(litr.hasNext()) {
			System.out.println(litr.previous());
		}
		
	}
}
