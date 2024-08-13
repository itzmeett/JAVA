package com.programs;

class Thread1 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		for(int i=0; i<100; i++) {
			System.out.println("Meet");
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThread {
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
//		t1.setPriority(4);
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		System.out.println(t1.getPriority());
		t2.start();
	}
}
