package com.collection;
import java.util.ArrayList;
import java.util.HashSet;
//import java.util.HasMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapDemo {
	
	public static void main(String args[]) {
		
		ArrayList al = new ArrayList();
	
		al.add(10);
		al.add(10.10);
		al.add("Meet");
		al.add(true);
		al.add(null);
		al.add(10);
		
		System.out.println(al);
		System.out.println(al.get(3));
		System.out.println(al.indexOf('t'));
		System.out.println(al);
		
		
	}
	
}
