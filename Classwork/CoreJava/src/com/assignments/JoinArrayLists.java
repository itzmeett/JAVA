package com.assignments;
import java.util.ArrayList;
import java.util.List;

	public class JoinArrayLists {
	    public static void main(String[] args) {
	        ArrayList<String> arrayList1 = new ArrayList<>();
	        arrayList1.add("Meet");
	        arrayList1.add("Pujan");
	        arrayList1.add("Yaani");

	        ArrayList<String> arrayList2 = new ArrayList<>();
	        arrayList2.add("Rohan");
	        arrayList2.add("Esha");
	        arrayList2.add("Harsh");

	        ArrayList<String> joinedList = new ArrayList<>(arrayList1);
	        joinedList.addAll(arrayList2);

	        System.out.println("Joined ArrayList: " + joinedList);
	    }
	}

