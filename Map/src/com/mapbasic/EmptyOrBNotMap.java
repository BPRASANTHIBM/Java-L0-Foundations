package com.mapbasic;

import java.util.HashMap;

public class EmptyOrBNotMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "pencil");
		map.put(2, "pen");
		map.put(3, "Computer");
		map.put(5, "Laptop");
		
		System.out.println("The Associate value is "+ map);
		if(map.isEmpty()) {
			System.out.println("Map is Empty");
		}
		else
			System.out.println("The Map Contain the values");
		
	}

}
