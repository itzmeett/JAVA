package com.assignments;
import java.util.ArrayList;

public class IterateList {

	    public static void main(String[] args) {
	        ArrayList<String> arrayList = new ArrayList<>();

	        arrayList.add("Meet");
	        arrayList.add("Pujan");
	        arrayList.add("Yaani");
	        arrayList.add("Rohan");

	        System.out.println("Iterating through all elements in the ArrayList:");
	        for (String element : arrayList) {
	            System.out.println(element);
	        }
	    }
	}