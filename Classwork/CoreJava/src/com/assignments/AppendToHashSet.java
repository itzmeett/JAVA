package com.assignments;

import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add some elements to the HashSet
        hashSet.add("Meet");
        hashSet.add("Pujan");
        hashSet.add("Yaani");
        hashSet.add("Rohan");

        System.out.println("HashSet before appending: " + hashSet);

        String elementToAppend = "Esha";

        hashSet.add(elementToAppend);

        System.out.println("HashSet after appending: " + hashSet);
    }
}

