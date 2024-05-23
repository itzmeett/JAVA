package com.assignments;

	abstract class Shape {
	    public abstract double RectangleArea(double length, double breadth);
	    public abstract double SquareArea(double side);
	    public abstract double CircleArea(double radius);
	}

	class Area extends Shape {
	    public double RectangleArea(double length, double breadth) {
	        return length * breadth;
	    }

	    public double SquareArea(double side) {
	        return side * side;
	    }

	    public double CircleArea(double radius) {
	        return Math.PI * radius * radius;
	    }
	}

	public class SpaesCalculator {
	    public static void main(String[] args) {
	        Area area = new Area();

	        double rectangleArea = area.RectangleArea(5, 4);
	        double squareArea = area.SquareArea(5);
	        double circleArea = area.CircleArea(5);

	        System.out.println("Area of Rectangle: " + rectangleArea);
	        System.out.println("Area of Square: " + squareArea);
	        System.out.println("Area of Circle: " + circleArea);
	    }
	}

