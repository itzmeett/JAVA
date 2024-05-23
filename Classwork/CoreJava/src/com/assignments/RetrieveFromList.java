package com.assignments;
import java.util.ArrayList;


	public class RetrieveFromList {
	    public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<>();

	        arrayList.add("Meet");
	        arrayList.add("Harsh");
	        arrayList.add("Rohan");
	        arrayList.add("Vihar");

	        int index = 2;
	        if (index >= 0 && index < arrayList.size()) {
	            String element = arrayList.get(index);
	            System.out.println("Element at index " + index + ": " + element);
	        } else {
	            System.out.println("Index is out of range");
	        }
	    }
	}
