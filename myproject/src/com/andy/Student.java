package com.andy;

public class Student {
	private int english;

	protected String name;

	public void getEnglish(int english) {
		if (english <= 100 && english >= 0) {
			this.english = english;
		}
	}

	public Student(int english, String name) {
		this.english = english;
		this.name = name;
	}

	public void print() {
		System.out.println(name + "/t" + english);
	}

}
