package com.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElementsInArrayList {
    public static void main(String[] args) {
    	
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Meet");
        arrayList.add("Pujan");
        arrayList.add("Yaani");
        arrayList.add("Rohan");

        System.out.println("ArrayList before swapping: " + arrayList);

        int index1 = 1; 
        int index2 = 3; 
        Collections.swap(arrayList, index1, index2);

        System.out.println("ArrayList after swapping: " + arrayList);
    }
}


