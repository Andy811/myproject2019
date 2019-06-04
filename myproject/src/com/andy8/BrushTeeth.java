package com.andy8;

public class BrushTeeth extends Thread {

	public void run() {
		System.out.println("Brush teeth");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Brushed");
	}
}
