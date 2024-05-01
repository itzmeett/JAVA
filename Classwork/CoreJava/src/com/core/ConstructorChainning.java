package com.core;

class A{
	int a,b,c,d;
	A(){
		System.out.println("Default Constructor from chlass-A");
	}
	
	A(int a, int b){
//		this();
		this.a = a;
		this.b = b;
	
		System.out.println("Parameterized Constructor");	
		c = a-b;
		System.out.println("a-b = "+ c);
	}
	
	A(int d){
		this(4,4);
		d = 5;
		System.out.println("d = "+d);
	}
}

class B extends A{
	int a,b;  
	B(){
		super(3,1);
		System.out.println("Default Constructor from chlass-B");
	}
	
	B(int a, int b){
//		super(3,1);
		this.a = a;
		this.b = b;
		System.out.println("a+b from class-B = " + (a+b));
	}
}

public class ConstructorChainning {
	public static void main(String args[]) {
		
	A obj = new A();
	A obj1 = new A(4,6);
	A obj2 = new A(6);
	B ob = new B();
	B ob1 = new B(2,3);
	}
}
