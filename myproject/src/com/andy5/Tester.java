package com.andy5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilterReader;

public class Tester {

	public static void main(String[] args) {

		int n = Integer.parseInt("35");

		File file = new File("aa.txt");
		if (file.exists()) {
			System.out.println(file.getTotalSpace());
			System.out.println(file.getAbsolutePath());
		}
		File dir = new File("C:\\test");
		if (dir.exists() && dir.isDirectory()) {
			String[] content = dir.list();
			for (String s : content) {
				System.out.println(s);
			}
		}
		File fi = new File(dir, "aaa\\bbb\\ccc");
		System.out.println(fi.mkdirs());
		File[] ff=	fi.listFiles();
		for(File f : ff) {
			f.delete();
		}

	}

}
