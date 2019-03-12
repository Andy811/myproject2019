package com.andy;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMap2019 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap();
		Random ran = new Random(666);

		for (int i = 0; i < 10000; i++) {
			int key = ran.nextInt(20);
			Integer value = map.get(key);
			map.put(key, value == null ? 1 : value + 1);
		}
		System.out.println(map);
	}

}
