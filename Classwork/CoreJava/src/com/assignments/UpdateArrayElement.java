package com.assignments;

public class UpdateArrayElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int indexToUpdate = 2;
        int newValue = 10;

        if (indexToUpdate >= 0 && indexToUpdate < array.length) {
            array[indexToUpdate] = newValue;
        } else {
            System.out.println("Index out of bounds");
        }

        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
