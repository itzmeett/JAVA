package com.assignments;

public class Triangle {
    public void printPerimeter() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        int perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle: " + perimeter);
    }

    public void printArea() {
        int side1 = 3;
        int side2 = 4;
        int side3 = 5;
        double semiPerimeter = (side1 + side2 + side3) / 2.0;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        System.out.println("Area of the triangle: " + area);
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printPerimeter();
        triangle.printArea();      
    }
}
