package com.assignments;

public class DaemonThread extends Thread {
	    public void run() {
	        System.out.println("Thread is running");
	    }

	    public static void main(String args[]) {
	    	DaemonThread t1 = new DaemonThread();
	    	DaemonThread t2 = new DaemonThread();
	        
	        t1.start();
	        t1.setDaemon(true);
	        
	        t2.start();
	    }
	}

