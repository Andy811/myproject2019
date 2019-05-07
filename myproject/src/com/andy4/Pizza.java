package com.andy4;

import java.util.InputMismatchException;

public class Pizza {

	public Pizza(String answer) throws PizzaException {

		int piece;
		try {
			piece = Integer.parseInt(answer);
		} catch (NumberFormatException e) {
			System.out.println("請輸入數字r");
			throw new PizzaException(answer);

		}
		if (piece == 0) {
			System.out.println("確定不要切?");
		}
		if (piece == 8 || piece == 12 || piece == 16) {
			System.out.println("謝謝選購");
		}
		if (piece < 0 || piece > 15) {
			System.out.println("超出範圍");
		}
		if (piece > 0 && piece < 8 || piece > 8 && piece < 12 || piece > 12 && piece < 16) {
			System.out.println("數量錯誤");
		}

	}

}
