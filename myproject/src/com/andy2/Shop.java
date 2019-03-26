package com.andy2;

import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		Item item = new Item();
		while (true) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("名稱");
			String name = scanner.nextLine();

			if (name.equals("q")) {
				System.out.println("結束");
				break;
			}
			System.out.println("數量");
			int number = Integer.parseInt(scanner.nextLine());

			item.setCar(name, number);
			item.getCar();

		}
	}
}
