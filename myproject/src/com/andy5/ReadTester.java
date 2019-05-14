package com.andy5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTester {

	public static void main(String[] args) {
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("result.txt");
		int n = fi.read();
		while(n != -1) {
		System.out.println((char)n);
		n=fi.read();
		}
			System.out.println(fi.read());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}

}
