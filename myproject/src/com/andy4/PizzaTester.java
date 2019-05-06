package com.andy4;

import java.util.Scanner;

public class PizzaTester {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Pizza·Q¤Á´X¤ù(8,12,16)");
			Pizza pizza = new Pizza(scanner.nextLine());
		} catch (PizzaException e) {
		}
	}

}
