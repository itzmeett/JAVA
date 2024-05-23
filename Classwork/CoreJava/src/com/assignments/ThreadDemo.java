package com.assignments;

	class MyRunnable implements Runnable {
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

	public class ThreadDemo {
	    public static void main(String[] args) {
	        MyRunnable myRunnable = new MyRunnable();
	        Thread thread = new Thread(myRunnable);
	        thread.start();
	    }
}
