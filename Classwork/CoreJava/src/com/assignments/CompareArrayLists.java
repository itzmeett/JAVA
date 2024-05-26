package com.assignments;
import java.util.ArrayList;

public class CompareArrayLists {
    public static void main(String[] args) {
    	
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Meet");
        arrayList1.add("Pujan");
        arrayList1.add("Yaani");
        arrayList1.add("Rohan");

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Meet");
        arrayList2.add("Pujan");
        arrayList2.add("Yaani");
        arrayList2.add("Rohan");

        boolean isEqual = arrayList1.equals(arrayList2);

        if (isEqual) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }
    }
}

