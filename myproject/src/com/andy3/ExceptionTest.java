package com.andy3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("�п�J�^�妨�Z");
			Score english = new Score(scanner.nextLine());

			System.out.println("�п�J�ƾǦ��Z");
			Score math = new Score(scanner.nextLine());

		} catch (ScoreException e) {

		}

	}

}
