package com.assignments;
import java.util.HashSet;

	public class NumberOfElementsHashset {
	    public static void main(String[] args) {
	        HashSet<String> hashSet = new HashSet<>();

	        hashSet.add("Meet");
	        hashSet.add("Pujan");
	        hashSet.add("Yaani");
	        hashSet.add("Rohan");

	        int numberOfElements = hashSet.size();

	        System.out.println("Number of elements in the HashSet: " + numberOfElements);
	    }
	}

