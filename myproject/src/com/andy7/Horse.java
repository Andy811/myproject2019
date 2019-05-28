package com.andy7;

public class Horse extends Thread {
	public Horse(String name) {
		setName(name);
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(getName() + i);
		}
	}
}
