package com.assignments;

public class PrintNumber {

    public void printn(int number) {
        System.out.println("Integer: " + number);
    }

    public void printn(double number) {
        System.out.println("Double: " + number);
    }

    public void printn(float number) {
        System.out.println("Float: " + number);
    }

    public void printn(long number) {
        System.out.println("Long: " + number);
    }

    public void printn(short number) {
        System.out.println("Short: " + number);
    }

    public void printn(byte number) {
        System.out.println("Byte: " + number);
    }

    public void printn(char character) {
        System.out.println("Character: " + character);
    }

    public void printn(boolean bool) {
        System.out.println("Boolean: " + bool);
    }

    public void printn(String str) {
        System.out.println("String: " + str);
    }

    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();

        printNumber.printn(4);            
        printNumber.printn(4.14);  
        printNumber.printn(4.814f);        
        printNumber.printn(123456789L);   
        printNumber.printn((short) 12345); 
        printNumber.printn((byte) 44);    
        printNumber.printn('M');           
        printNumber.printn(false);          
        printNumber.printn("Meet Patel"); 
    }
}
