package com.programs;

interface Computer{
	void code(); 
}

class Laptop implements Computer{
	public void code() {
		System.out.println("using laptop");
	}
}

class Desktop implements Computer{
	public void code(){
		System.out.println("Using Computer");
	}
}

class Developer{
	public void devApp(Computer c) {
		c.code();
	}
}

public class DynamicMethodDispatch {
	public static void main(String[] args) {
		
		Computer lap = new Laptop();
		Computer desk = new Desktop();
		Developer meet = new Developer();
		meet.devApp(lap);
	}
}
