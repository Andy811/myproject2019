package com.andy2;

import java.util.HashMap;
import java.util.Map;

public class Item {

	Map<String,Integer> map = new HashMap<>();
	
	
	public void setCar(String item, int number) {
		
		map.put(item, map.get(item)==null? number : number+map.get(item)) ;
	}
	public void getCar() {
		System.out.println(map);
	}
}
