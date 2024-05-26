package com.assignments;
import java.util.ArrayList;
import java.util.Collections;

public class ReversearrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Meet");
        arrayList.add("Pujan");
        arrayList.add("Yaani");
        arrayList.add("Rohan");

        System.out.println("ArrayList before reversal: " + arrayList);

        Collections.reverse(arrayList);

        System.out.println("ArrayList after reversal: " + arrayList);
    }
}

