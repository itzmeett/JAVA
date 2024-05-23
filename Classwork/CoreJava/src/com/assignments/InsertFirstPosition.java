package com.assignments;
import java.util.ArrayList;


	public class InsertFirstPosition {
	    public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<>();

	        arrayList.add("Meet");
	        arrayList.add("Harsh");
	        arrayList.add("Rohan");

	        System.out.println("ArrayList before insertion: " + arrayList);

	        arrayList.add(0, "Manan");

	        System.out.println("ArrayList after insertion: " + arrayList);
	    }
	}
