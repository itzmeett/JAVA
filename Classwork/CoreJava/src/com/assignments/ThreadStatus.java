package com.assignments;

	class MyThread extends Thread {
	    public void run() {
	        System.out.println("Thread is running");
	        try {
	            Thread.sleep(2000); 
	        } catch (InterruptedException e) {
	            System.out.println("Thread interrupted");
	        }
	        System.out.println("Thread execution completed");
	    }
	}

	public class ThreadStatus {
	    public static void main(String[] args) {
	        MyThread myThread = new MyThread();
	        myThread.start();
	    }
}
