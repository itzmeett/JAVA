package com.thread;

class ThreadDemo1 implements Runnable {
	Thread t;
	
	public void newThread() {
		t = new Thread(this, "Child Thread");
		t.start();
		
	}
	
	public void run() {
		try {
			for(int i=0; i<=5; i++) {
				System.out.println(t +" : "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Child Thread Exiting");
	}	
}

class ThreadPractice { 
	public static void main(String[] args) {
		new ThreadPractice();
	}

}
