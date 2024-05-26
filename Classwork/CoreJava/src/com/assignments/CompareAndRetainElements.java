package com.assignments;

import java.util.HashSet;
import java.util.Set;

public class CompareAndRetainElements {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("Meet");
        set1.add("Pujan");
        set1.add("Yaani");

        Set<String> set2 = new HashSet<>();
        set2.add("Pujan");
        set2.add("grape");
        set2.add("Yaani");

        set1.retainAll(set2);

        System.out.println("Common elements retained in both sets: " + set1);
    }
}
