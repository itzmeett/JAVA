package com.assignments;

import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Meet");
        hashSet.add("Pujan");
        hashSet.add("Yaani");
        hashSet.add("Rohan");

        System.out.println("Iterating through all elements using Iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("\nIterating through all elements using for-each loop:");
        for (String element : hashSet) {
            System.out.println(element);
        }
    }
}
