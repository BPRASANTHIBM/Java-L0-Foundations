package com.mapbasic;

import java.util.HashMap;

public class CopyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "pencil");
		map.put(99, "pencil");
		map.put(2, "pen");
		map.put(12, "Computer");
		map.put(11, "Laptop");
		
		System.out.println("The Associate value is "+ map);
		
		HashMap<Integer, String> map1 = new HashMap<>();
		
		map1.putAll(map);
		System.out.println(map1);
	}

}
