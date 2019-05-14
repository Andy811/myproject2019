package com.andy5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class JavaExam {
	public static void main(String[] args) throws IOException {
		PrintWriter pw = null;
		try {

//		 OutputStreamWriter fos = new OutputStreamWriter(new
//		FileOutputStream("result.txt"),"utf-8");
			FileWriter fw = new FileWriter("result.txt");
			pw = new PrintWriter(fw);
			fw.write("JAVA嵇安德");
			fw.flush();
			fw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}

}
