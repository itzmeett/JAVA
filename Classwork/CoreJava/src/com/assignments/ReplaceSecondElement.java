package com.assignments;
import java.util.ArrayList;

public class ReplaceSecondElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Meet");
        arrayList.add("Pujan");
        arrayList.add("Yaani");
        arrayList.add("Rohan");

        System.out.println("Original ArrayList: " + arrayList);

        if (arrayList.size() >= 2) {
            String specifiedElement = "Esha";
            arrayList.set(1, specifiedElement);
            System.out.println("ArrayList after replacing the second element: " + arrayList);
        } else {
            System.out.println("ArrayList does not have enough elements to replace the second element.");
        }
    }
}
