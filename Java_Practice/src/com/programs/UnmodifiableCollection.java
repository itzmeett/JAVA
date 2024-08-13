package com.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class UnmodifiableCollection {
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<>();
		lst.add(5);
		lst.add(8);
		lst.add(2);
		lst.add(6);
		
//		List<Integer> read = Collections.unmodifiableList(lst);
		
//		try {
//			read.add(4);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		for(Integer i: lst) {
//			System.out.println(i);
//		}
		
		Iterator<Integer> it = lst.iterator();
		
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
		
		
	}
}
