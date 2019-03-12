package com.andy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListPractice {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random ran = new Random();
		for(int i=0; i<20; i++) {
			list.add(0);
		}
		for(int i=0; i<10000; i++) {
			int num = ran.nextInt(20);
			Integer freqs = list.get(num);
			list.set(num, freqs+1);
			
		}
		for(int i=0; i<20; i++) {
		System.out.println(i+":"+list.get(i));
		}
	
		
	}

}
