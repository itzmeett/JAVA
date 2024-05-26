package com.assignments;

import java.util.ArrayList;

public class SearchElement {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Meet");
        arrayList.add("Pujan");
        arrayList.add("Yaani");
        arrayList.add("Rohan");

        System.out.println("ArrayList: " + arrayList);

        String elementToSearch = "Yaani";
        
        searchElement(arrayList, elementToSearch);
    }

    public static void searchElement(ArrayList<String> arrayList, String element) {
        if (arrayList.contains(element)) {
            int index = arrayList.indexOf(element);
            System.out.println("Element '" + element + "' is present at index " + index);
        } else {
            System.out.println("Element '" + element + "' is not present in the list.");
        }
    }
}
