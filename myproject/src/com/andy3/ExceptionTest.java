package com.andy3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		int math, english, average = 0;

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("請輸入英文成績");
			english = scanner.nextInt();
			if (english < 0 || english > 100) {
				throw new GradeException(english);
			}
			
			System.out.println("請輸入數學成績");
			math = scanner.nextInt();

			if (math < 0 || math > 100) {
				throw new GradeException(math);
			}
			average = (math + english) / 2;
			System.out.println("平均是" + average);
		} catch (InputMismatchException e) {
			System.out.println("必須輸入數字");
		} catch (GradeException e) {
			System.out.println(e.getMessage());
		}

	}

}
