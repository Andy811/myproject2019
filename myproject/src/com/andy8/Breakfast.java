package com.andy8;

public class Breakfast extends Thread{

	public void run() {
		System.out.println("Making breakfast");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished");
	}
}
