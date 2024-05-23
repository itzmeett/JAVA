package com.assignments;

public class PrintNumberAndChar {

    public void print(int n, char c) {
        System.out.println("Integer: " + n + ", Character: " + c);
    }

    public void print(char c, int n) {
        System.out.println("Character: " + c + ", Integer: " + n);
    }

    public static void main(String[] args) {
        PrintNumberAndChar printNumberAndChar = new PrintNumberAndChar();

        printNumberAndChar.print(41, 'M');   
        printNumberAndChar.print('P', 14);   
    }
}
