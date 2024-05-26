package com.assignments;
import java.util.HashMap;

	public class HashmapKeyValue {
	    public static void main(String[] args) {
	        HashMap<String, Integer> hashMap = new HashMap<>();

	        hashMap.put("One", 1);
	        hashMap.put("Two", 2);
	        hashMap.put("Three", 3);
	        hashMap.put("Four", 4);

	        System.out.println("HashMap before association: " + hashMap);

	        String key = "Five";
	        int value = 5;
	        hashMap.put(key, value);

	        System.out.println("HashMap after association: " + hashMap);
	    }
	}

