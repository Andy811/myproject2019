package com.andy3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		int math, english, average = 0;

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("�п�J�^�妨�Z");
			english = scanner.nextInt();
			if (english < 0 || english > 100) {
				throw new GradeException(english);
			}
			
			System.out.println("�п�J�ƾǦ��Z");
			math = scanner.nextInt();

			if (math < 0 || math > 100) {
				throw new GradeException(math);
			}
			average = (math + english) / 2;
			System.out.println("�����O" + average);
		} catch (InputMismatchException e) {
			System.out.println("������J�Ʀr");
		} catch (GradeException e) {
			System.out.println(e.getMessage());
		}

	}

}
