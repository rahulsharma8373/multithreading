package com.thread;

class MultithreadDemo1 implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Thrwead " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
		}

	}

}

/**
 * @author rahul
 *
 */
public class Main {

	public static void main(String[] args) {
		int n = 9;
		for (int i = 0; i < n; i++) {
			Thread obj = new Thread(new MultithreadDemo1());
			obj.start();
		}
	}

}
/*
 * Thread Class vs Runnable Interface
 * If we extend the Thread class, our class cannot extend any other class
 * because Java doesn’t support multiple inheritance. But, if we implement the
 * Runnable interface, our class can still extend other base classes. We can
 * achieve basic functionality of a thread by extending Thread class because it
 * provides some inbuilt methods like yield(), interrupt() etc. that are not
 * available in Runnable interface. Using runnable will give you an object that
 * can be shared amongst multiple threads.
 */