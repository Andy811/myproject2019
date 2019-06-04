package com.andy8;

public class Wizard extends Thread{

	public void thunder() {
		System.out.println("thunder start");
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thunder stop");
	}
	public void run() {
		thunder();
	}
}
