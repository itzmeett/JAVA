package com.assignments;

	class SThread extends Thread {
	    private String threadName;

	    public SThread(String name) {
	        threadName = name;
	    }

	    public void run() {
	        try {
	            System.out.println(threadName + " is running");
	            Thread.sleep(2000);
	            System.out.println(threadName + " execution completed");
	        } catch (InterruptedException e) {
	            System.out.println(threadName + " interrupted");
	        }
	    }
	}

	public class ThreadSleep {
	    public static void main(String[] args) {
	        SThread thread1 = new SThread("Thread 1");
	        SThread thread2 = new SThread("Thread 2");

	        thread1.start();
	        thread2.start();
	    }
	}
