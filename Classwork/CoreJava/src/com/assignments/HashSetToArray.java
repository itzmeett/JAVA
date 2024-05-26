package com.assignments;
import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
    	
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Meet");
        hashSet.add("Pujan");
        hashSet.add("Yaani");
        hashSet.add("Rohan");

        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);

        System.out.println("Array from HashSet:");
        for (String element : array) {
            System.out.println(element);
        }
    }
}

