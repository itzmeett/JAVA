package com.programs;

class Table{
	synchronized void printTable(int n){
		for(int i =1; i<=25; i++) {
			System.out.println(i*n);
		}
	}
}

class Thread3 extends Thread{
	Table t;
	Thread3(Table t){
		this.t = t;
	}
	public void run(){
		t.printTable(2);
	}
}

class Thread4 extends Thread{
	Table t;
	Thread4(Table t){
		this.t = t;
	}
	public void run() {
		t.printTable(3);
	}
}


public class SyncronizedThread {
	public static void main(String[] args) {
		Table t = new Table();
		Thread3 t1= new Thread3(t);
		Thread4 t2= new Thread4(t);
		t1.start();
		t2.start();
//		t.printTable(5);
	}
}
