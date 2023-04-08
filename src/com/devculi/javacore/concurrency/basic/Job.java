package com.devculi.javacore.concurrency.basic;

public class Job implements Runnable {
	private String name;

	public Job(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Job " + name + " running");

	}
}
