package com.assignments;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapValuesCollectionView {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Meet");
        map.put(2, "Puajn");
        map.put(3, "Yani");

        Collection<String> values = map.values();

        System.out.println("Collection view of the values in the map: " + values);
    }
}

