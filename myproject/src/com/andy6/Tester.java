package com.andy6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Tester {

	public static void main(String[] args) throws IOException {

		FileInputStream fis;
		try {
			fis = new FileInputStream("aa.txt");
			int n = fis.read();
			while (n != -1) {
				System.out.print(n);
				n = fis.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		Reader ir = new InputStreamReader(fis);
	}

}
