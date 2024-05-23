package com.assignments;
import java.util.ArrayList;

public class RemoveElement {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Meet");
        arrayList.add("Pujan");
        arrayList.add("Yaani");
        arrayList.add("Rohan");

        System.out.println("ArrayList before removal: " + arrayList);

        int indexToRemove = 2;
        if (indexToRemove >= 0 && indexToRemove < arrayList.size()) {
            arrayList.remove(indexToRemove);
            System.out.println("Removed element at index " + indexToRemove);
        } else {
            System.out.println("Index is out of range");
        }

        System.out.println("ArrayList after removal: " + arrayList);
    }
}
