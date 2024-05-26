package com.assignments;
import java.util.HashMap;
import java.util.Map;

public class CheckMapEmpty {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        boolean isEmpty = map.isEmpty();

        if (isEmpty) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty.");
        }
    }
}
