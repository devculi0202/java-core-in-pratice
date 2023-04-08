package com.devculi.javacore.concurrency.basic;

public class MainApp extends Thread {
	
    public static void main(String[] args) {
		Thread thread1 = new Thread(new Job("1"));
		thread1.start();
		
		Thread thread2 = new Thread(new Job("2"));
		thread2.start();
	}
}
