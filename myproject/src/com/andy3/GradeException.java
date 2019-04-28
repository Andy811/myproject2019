package com.andy3;

public class GradeException extends Exception {
	int grade;

	public GradeException(int grade) {
		this.grade = grade;
	
	getMessage();
	}
 public String getMessage() {
	 return ("分數必須介於0~100"+grade);
 }
}
