package com.andy8;

public class WizardTest {

	public static void main(String[] args) {

		Wizard w1 = new Wizard();
		w1.start();
		Wizard w2 = new Wizard();
		try {
			w1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		w2.start();
		
	}

}
