package com.assignments;
import java.util.ArrayList;

	public class UpdateArray {

	    public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<>();

	        arrayList.add("Meet");
	        arrayList.add("Pujan");
	        arrayList.add("Yaani");
	        arrayList.add("Rohan");

	        System.out.println("ArrayList before update: " + arrayList);

	        // Update the element at index 2 with "Krishna"
	        int indexToUpdate = 3;
	        String newElement = "Harsh";
	        if (indexToUpdate >= 0 && indexToUpdate < arrayList.size()) {
	            arrayList.set(indexToUpdate, newElement);
	            System.out.println("Updated element at index " + indexToUpdate + ": " + arrayList.get(indexToUpdate));
	        } else {
	            System.out.println("Index is out of range");
	        }

	        System.out.println("ArrayList after update: " + arrayList);
	    }
	}
