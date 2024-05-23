package com.assignments;
import java.util.ArrayList;

public class ListColor {

	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>();

	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        System.out.println("Colors in the collection:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	    }
	}

