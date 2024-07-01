package com.learning.runnable_callable;

public class RunnableExUsingLamda {
	public static void main(String[] args) {
		Thread thread = new Thread(() -> System.out.println("Thread is running with Runnable interface"));
		thread.start();
	}

}
