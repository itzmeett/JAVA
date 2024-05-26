package com.assignments;
import java.util.HashMap;
import java.util.Map;

	public class CountMapping {
	    public static void main(String[] args) {
	        Map<String, Integer> map = new HashMap<>();

	        map.put("One", 1);
	        map.put("Two", 2);
	        map.put("Three", 3);
	        map.put("Four", 4);

	        int size = map.size();

	        System.out.println("Number of key-value mappings in the Map: " + size);
	    }
	}

