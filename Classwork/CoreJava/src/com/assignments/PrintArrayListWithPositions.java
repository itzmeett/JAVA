package com.assignments;
import java.util.ArrayList;

public class PrintArrayListWithPositions {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Meet");
        arrayList.add("Pujan");
        arrayList.add("Yaani");
        arrayList.add("Rohan");

        System.out.println("Elements of the ArrayList with their positions:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Position " + i + ": " + arrayList.get(i));
        }
    }
}

