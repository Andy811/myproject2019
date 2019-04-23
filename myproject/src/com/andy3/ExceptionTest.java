package com.andy3;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		int math, english, average = 0;
		
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("請輸入英文成績");
			english = scanner.nextInt();
			System.out.println("請輸入數學成績");
			math = scanner.nextInt();
		if(english<0 || english>100 || math<0 || math>100) {
		throw new GradeException();
			
		}
		
			average = (math+english)/2;
			System.out.println("平均分數為" + average);
		} catch (Exception e) {
			System.out.println("輸入格式錯誤");
		}
	}

}
