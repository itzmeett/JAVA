package com.assignments;

	class Parent {
	    public void printParent() {
	        System.out.println("This is a parent class");
	    }
	}

	class Child extends Parent {
	    public void printChild() {
	        System.out.println("This is a child class");
	    }
	}

		public class Inheritance {
	    public static void main(String[] args) {
	        Parent parent = new Parent();
	        parent.printParent();
	        
	        Child child = new Child();
	        child.printChild();
	        child.printParent();
	    }
	}
