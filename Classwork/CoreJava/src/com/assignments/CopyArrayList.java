package com.assignments;
import java.util.ArrayList;

public class CopyArrayList {

    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Meet");
        originalList.add("Pujan");
        originalList.add("Yaani");
        originalList.add("Rohan");

        System.out.println("Original ArrayList: " + originalList);

        ArrayList<String> copiedListConstructor = new ArrayList<>(originalList);
        System.out.println("Copied ArrayList using constructor: " + copiedListConstructor);

        ArrayList<String> copiedListAddAll = new ArrayList<>();
        copiedListAddAll.addAll(originalList);
        System.out.println("Copied ArrayList using addAll method: " + copiedListAddAll);
    }
}
