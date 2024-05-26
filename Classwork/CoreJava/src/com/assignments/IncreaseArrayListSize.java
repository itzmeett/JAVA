package com.assignments;
import java.util.ArrayList;

public class IncreaseArrayListSize {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("Original size of ArrayList: " + arrayList.size());

        arrayList.ensureCapacity(6);  		 

        System.out.println("New size of ArrayList: " + arrayList.size());
    }
}
