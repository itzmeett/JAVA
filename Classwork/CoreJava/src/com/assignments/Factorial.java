package com.assignments;

public class Factorial {
    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        int[] numbers = {4, 3, 2, 1, 0};
        for (int num : numbers) {
            System.out.println(num + "! = " + calculateFactorial(num));
        }
    }
}

