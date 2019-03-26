package com.andy2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Shop2 {

	public static void main(String[] args) {
	List<Item2> items = new ArrayList<>();
	Scanner scanner = new Scanner(System.in);
	 while(true) {
		 System.out.println("名稱");
		 String name = scanner.nextLine();
		 System.out.println("數量");
		 int num = Integer.parseInt(scanner.nextLine());
		 items.add(new Item2(name, num));
		 
		 for(Item2 item : items) {
			 System.out.println(item.name+"\t"+item.number);
		 }
	 }
	}

}
