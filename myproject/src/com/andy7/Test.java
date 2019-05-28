package com.andy7;

public class Test {

	public static void main(String[] args) {

		Horse h2 = new Horse("h2 ");
		h2.start();

//		HorseRunnable h2 = new HorseRunnable();
//		Thread thread = new Thread(h2);
//		thread.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("h1 " + i);
		}
		System.out.println("end----------------------");
	}

}
