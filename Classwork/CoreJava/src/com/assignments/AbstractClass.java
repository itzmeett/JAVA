package com.assignments;

	abstract class Parent_1 {
	    public abstract void message(); 
	}

	class FirstSubclass extends Parent_1 {
	    public void message() {
	        System.out.println("This is first subclass");
	    }
	}

	class SecondSubclass extends Parent_1 {
	    public void message() {
	        System.out.println("This is second subclass");
	    }
	}

	public class AbstractClass {
	    public static void main(String[] args) {
	        Parent_1 obj1 = new FirstSubclass();
	        obj1.message();

	        Parent_1 obj2 = new SecondSubclass();
	        obj2.message();
	    }
	}

