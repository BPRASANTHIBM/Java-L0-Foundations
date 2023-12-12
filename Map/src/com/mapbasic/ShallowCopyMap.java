package com.mapbasic;

import java.util.HashMap;

public class ShallowCopyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "pencil");
		map.put(2, "pen");
		map.put(3, "Computer");
		map.put(5, "Laptop");
		
		System.out.println("The Associate value is "+ map);
		
		HashMap<Integer, String> map1 = new HashMap<>();	
		
		map1 = (HashMap<Integer, String>)map;
		System.out.println(map1);
	}

}
