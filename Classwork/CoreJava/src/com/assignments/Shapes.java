package com.assignments;
class Shape1 {
    public void printShape1() {
        System.out.println("This is shape");
    }
}

class Rectangle1 extends Shape1 {
    public void printRectangle1() {
        System.out.println("This is rectangular shape");
    }
}

class Circle1 extends Shape1 {
    public void printCircle1() {
        System.out.println("This is circular shape");
    }
}

class Square1 extends Rectangle1 {
    public Square1() {
        super(); 
    }

    public void printSquare1() {
        System.out.println("Square is a rectangle");
    }
}

public class Shapes {
    public static void main(String[] args) {
        Square1 square = new Square1();

        square.printShape1(); 
        square.printRectangle1();
    }
}
