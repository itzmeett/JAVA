package com.assignments;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetToList {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Meet");
        hashSet.add("Pujan");
        hashSet.add("Yaani");
        hashSet.add("Rohan");

        List<String> arrayList = new ArrayList<>(hashSet);

        System.out.println("ArrayList from HashSet:");
        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}

