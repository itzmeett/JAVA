package com.thread;

class NewThread implements Runnable{
//	class NewThread extends Thread{
	
    Thread t;
	public NewThread() {
		t = new Thread(this, "Child Thread");
		t.start();
	}
	
	public void run() {
		try {
			for (int i=0; i<5; i++) {
				System.out.println(t + ": "+i);
				Thread.sleep(800);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
		System.out.println("Child Thread Exiting");
	}
	
}


public class ThreadDemo {

	public static void main(String args[]) {
		new NewThread();
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		t.setName("ThreadDemo");
		System.out.println(t);
		
		t.setPriority(8);
		System.out.println(t+ "\n");
		
		try{
			for(int i=0; i<5; i++) {
				System.out.println(t + ": "+i);
				Thread.sleep(500);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println("Main Thread Exiting");
		}
		
	}

