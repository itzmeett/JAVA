package com.assignments;
import java.util.ArrayList;
import java.util.List;

	public class ExtractPortionOfArrayList {
	    public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<>();
	        arrayList.add("Meet");
	        arrayList.add("Pujan");
	        arrayList.add("Yaani");
	        arrayList.add("Rohan");

	        System.out.println("Original ArrayList: " + arrayList);

	        int fromIndex = 1;
	        int toIndex = 3; 
	        List<String> subList = arrayList.subList(fromIndex, toIndex);

	        System.out.println("Extracted portion of the ArrayList: " + subList);
	    }
	}

