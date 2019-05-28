package com.andy7;

public class HorseRunnable implements Runnable{

	 public HorseRunnable(String name) {
	
	 }
	@Override
	public void run() {

		for(int i=0; i<1000; i++) {
			System.out.println("h2 "+i);
		}
	}

}
