package com.assignments;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Meet");
        arrayList.add("Pujan");
        arrayList.add("Yaani");
        arrayList.add("Rohan");

        System.out.println("ArrayList before sorting: " + arrayList);

        Collections.sort(arrayList);

        System.out.println("ArrayList after sorting: " + arrayList);
    }
}

