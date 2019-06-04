package com.andy8;

public class Main1 {

	public static void main(String[] args) {
		System.out.println("Hello!");

		Breakfast breakfast = new Breakfast();
		BrushTeeth brush = new BrushTeeth();
		breakfast.start();
		brush.start();
		try {
			breakfast.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			brush.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
