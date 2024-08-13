package com.programs;

import java.util.HashMap;
import java.util.Map;

public class Collections {
	public static void main(String[] args) {
		
		Map<String, Integer> mp = new HashMap<>();
		
		mp.put("Java", 4000);
		mp.put("Python", 3000);
		mp.put("PHP", 1000);
		mp.put("Spring", 8000);
		mp.put("", 2332);
		mp.put("wer", 4029);
		System.out.println(mp);
		
//		for(Map.Entry<String,Integer> entry : mp.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + "\t value : " + entry.getValue()  );
//		}
		
		mp.forEach((k, v)->{
			System.out.println(k + " = " +v);
		});
		
	}
}
