package com.assignments;

	import java.util.HashMap;
	import java.util.Map;

	public class FrequentChar {
	    
	    public static char findSecondMostFrequentChar(String str) {
	        Map<Character, Integer> frequencyMap = new HashMap<>();

	        for (char c : str.toCharArray()) {
	            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
	        }

	        int firstMaxFreq = 0, secondMaxFreq = 0;
	        char firstMaxChar = '\0', secondMaxChar = '\0';

	        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
	            int freq = entry.getValue();
	            char c = entry.getKey();

	            if (freq > firstMaxFreq) {
	                secondMaxFreq = firstMaxFreq;
	                secondMaxChar = firstMaxChar;
	                firstMaxFreq = freq;
	                firstMaxChar = c;
	            } else if (freq > secondMaxFreq && freq != firstMaxFreq) {
	                secondMaxFreq = freq;
	                secondMaxChar = c;
	            }
	        }

	        return secondMaxChar;
	    }

	    public static void main(String[] args) {
	        String str = "successes";
	        char secondMostFrequent = findSecondMostFrequentChar(str);
	        System.out.println("The given string is: " + str);
	        System.out.println("The second most frequent char in the string is: " + secondMostFrequent);
	    }
	}

